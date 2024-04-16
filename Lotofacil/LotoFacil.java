package LotoFacil;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lotofacil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = -1;
		do {
			System.out.println();
			Separador();
			System.out.println("********** LOTOFÁCIL DO LUAN ***********");
			System.out.println("1) Apostar de 0 a 100");
			System.out.println("2) Apostar de A à Z");
			System.out.println("3) Apostar em par ou ímpar");
			System.out.println("0) Sair");
			Separador();
			

			System.out.print("Escolha uma opçao: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:
				try {
					
					System.out.print("DIGITE UM NUMERO DE (0 A 100): ");
					int num = sc.nextInt();
					verificarNumero(num);
					Random r = new Random();
					int numeroAleatorio = r.nextInt(101);

					if (numeroAleatorio == num) {
						System.out.println("Você ganhou R$ 1.0000 reais.");
					} else {
						System.out.println("Que pena! O número sorteado foi: " + numeroAleatorio);
					}
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}

				break;

			case 2:
				try {
					
					System.out.print("Digite uma letra de A a Z: ");
					char letra = (char) System.in.read();
					verificarLetra(letra);
					char letraPremiada = 'L';
					if (Character.toUpperCase(letra) == letraPremiada) {
						System.out.println("Você ganhou R$ 500,00 reais.");
					} else {
						System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
					}

				} catch (InputMismatchException e) {
					System.out.println("Error: " + e.getMessage());
				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			case 3:
				try {
					
					System.out.print("DIGITE UM NUMERO: ");
					int num = sc.nextInt();
					Numeropar(num);
				} catch (InputMismatchException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			case 0: System.out.println("ENCERRANDO... ");
			break;
			default:
				System.out.println("OPÇAO INVALIDA!  ");
				break;
			}
		} while (opcao != 0);

		sc.close();
	}

	public static void Separador() {
		System.out.println("****************************************");

	}

	public static void verificarNumero(int num) {
		if (num > 100 || num < 0) {
			throw new IllegalArgumentException("Aposta invalida (Digite um numero entre 0 e 100)");
		}
	}

	public static void verificarLetra(char letra) {
		if (!Character.isLetter(letra)) {
			throw new InputMismatchException("Aposta invalida (Digite uma letra)");

		}
	}

	public static void Numeropar(int num) {

		if (num % 2 == 0) {
			System.out.println("“Você ganhou R$ 100,00 reais");
		} else {
			System.out.println("QUE PENA! O número digitado é ímpar e a premiação foi para números pares");
		}
	}

}
