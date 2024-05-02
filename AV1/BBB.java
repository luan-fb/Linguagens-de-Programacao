package AV1;
    import java.util.ArrayList;
import java.util.Scanner;

	public class BBB {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String voto;
	        int opcao = -1;
	        ArrayList<Jogadores> jogadores = CadastroJogadores.cadastrojogadores();
	        
	        do {
	            System.out.println("----------  BBB ---------- ");
	            System.out.println("01 - PROSSEGUIR COM A VOTAÇAO ");
	            System.out.println("00 - SAIR ");
	            opcao = sc.nextInt();
	            sc.nextLine();

	            if (opcao != 0) {
	                System.out.println("Lista de jogadores:");
	                for (Jogadores jogador : jogadores) {
	                    System.out.println(jogador.getNome());
	                }
	                
	                System.out.print("Digite o nome de quem você vota para sair da casa? ");
	                voto = sc.nextLine();

	                for (Jogadores votado : jogadores) {
	                    if (votado.getNome().equalsIgnoreCase(voto)) {
	                        votado.incrementaUmVoto();
	                        break;
	                    }
	                }
	            }
	        } while (opcao != 0);

	        Jogadores maisVotado = jogadores.get(0);
	        for (Jogadores j : jogadores) {
	            if (j.getVotos() > maisVotado.getVotos()) {
	                maisVotado = j;
	            }
	        }

	        System.out.println("Com " + maisVotado.getVotos() + " votos, " + maisVotado.getNome() + " é quem sai.");
	        sc.close();
	    }
	}

