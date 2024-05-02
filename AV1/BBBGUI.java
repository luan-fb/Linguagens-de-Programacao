package AV1;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class BBBGUI extends JFrame {
    private JButton botaoVotar;
    private JButton botaoApurarResultado;
    private ArrayList<Jogadores> jogadores;

    public BBBGUI() {
        jogadores = CadastroJogadores.cadastrojogadores(); 
        configurarInterface();
        configurarEventos();
    }

    private void configurarInterface() {
        setTitle("Eliminação BBB");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 100);
        setLocationRelativeTo(null);

        botaoVotar = new JButton("Votar");
        botaoApurarResultado = new JButton("Apurar resultado");
        
        add(botaoVotar);
        add(botaoApurarResultado);
        
        setVisible(true);
    }

    private void configurarEventos() {
        botaoVotar.addActionListener(this::acaoVotar);
        botaoApurarResultado.addActionListener(this::acaoApurarResultado);
    }

    private void acaoVotar(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(this, "Em quem você vota para sair da casa?");
        if (nome != null && !nome.trim().isEmpty()) {
            Optional<Jogadores> jogador = jogadores.stream()
                    .filter(j -> j.getNome().equalsIgnoreCase(nome.trim()))
                    .findFirst();
            if (jogador.isPresent()) {
                jogador.get().incrementaUmVoto();
                JOptionPane.showMessageDialog(this, "Voto computado com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Jogador não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void acaoApurarResultado(ActionEvent e) {
        Jogadores jogadorEliminado = jogadores.stream()
                .max(Comparator.comparing(Jogadores::getVotos))
                .orElse(null);

        if (jogadorEliminado != null && jogadorEliminado.getVotos() > 0) {
            
            JOptionPane.showMessageDialog(this,"Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n"
            		+ "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu conseguir dizer o que eu nunca\n vou conseguir dizer, aí terá chegado o dia em que eu"
            		+ "vou conseguir te eliminar com alegria. \nCom" +jogadorEliminado.getVotos() +" votos, é você quem sai " + jogadorEliminado.getNome());
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum voto foi registrado.", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BBBGUI::new);
    }
}
