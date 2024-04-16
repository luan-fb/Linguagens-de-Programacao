package LotoFacil;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LotoFacilInterfaceGrafica extends JFrame {

	public LotoFacilInterfaceGrafica() {
		setTitle("LOTOFACIL DO LUAN");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 1));
		panel.setBackground(new Color(0, 0, 0));

		JLabel label = new JLabel("MENU LOTOFÁCIL: ");
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		label.setForeground(new Color(255, 255, 255));

		JButton button1 = new JButton("NUMERO PREMIADO: ");
		button1.setForeground(new Color(0, 0, 0));
		button1.setBackground(new Color(255, 255, 255));
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fazerApostaDe0a100();
			}
		});

		panel.add(button1);

		JButton button2 = new JButton("LETRA PREMIADA: ");
		button2.setForeground(new Color(0, 0, 0));
		button2.setBackground(new Color(255, 255, 255));
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Letrapremiada();
			}
		});

		panel.add(button2);


		JButton button3 = new JButton("PAR OU IMPAR: ");
		button3.setForeground(new Color(0, 0, 0));
		button3.setBackground(new Color(255, 255, 255));
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ParouImpar();
			}
		});

		panel.add(button3);
		
		JButton button4 = new JButton("ENCERRAR: ");
		button4.setForeground(new Color(0, 0, 0));
		button4.setBackground(new Color(255, 255, 255));
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(LotoFacilInterfaceGrafica.this, "ENCERRANDO!");
				System.exit(0);	
			}
		});

		panel.add(button4);

		add(panel);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LotoFacilInterfaceGrafica().setVisible(true);
			}
		});
	}

	public void fazerApostaDe0a100() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO DE (0 A 100): "));
		if (num > 100 || num < 0) {
			JOptionPane.showMessageDialog(this, "Aposta inválida.");
		} else {
			Random r = new Random();
			int numeroAleatorio = r.nextInt(101);

			if (numeroAleatorio == num) {
				JOptionPane.showMessageDialog(this, "Você ganhou R$ 1.000 reais.");
			} else {
				JOptionPane.showMessageDialog(this, " Que pena! O número sorteado foi: " + numeroAleatorio);
			}

		}
	}

	public void Letrapremiada() {
		System.out.println();

		char letra = Character.toUpperCase(JOptionPane.showInputDialog("DIGITE UMA LETRA DE A a Z: ").charAt(0));
		if (!Character.isLetter(letra)) {
			JOptionPane.showMessageDialog(this, "Aposta invalida (Digite uma letra)");

		}
		char letraPremiada = 'L';
		if (Character.toUpperCase(letra) == letraPremiada) {
			JOptionPane.showMessageDialog(this, " Você ganhou R$ 500,00 reais.");
		} else {
			JOptionPane.showMessageDialog(this, "Que pena! A letra sorteada foi: " + letraPremiada);
		}
	}
	
	public void ParouImpar() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO: "));

		if( num % 2 == 0) {
			JOptionPane.showMessageDialog(this, "Você ganhou R$ 100,00 reais");
		}
		else {
			JOptionPane.showMessageDialog(this, "QUE PENA! O número digitado é ímpar e a premiação foi para números pares");
		}
		
		
	}

}
