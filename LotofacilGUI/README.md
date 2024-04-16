# Projeto Lotofácil

## Sobre o Projeto
O projeto Lotofácil é uma aplicação Java que permite aos usuários realizar apostas em diferentes modalidades da loteria. Atualmente, o projeto oferece três opções de apostas: apostar em um número de 0 a 100, apostar em uma letra de A à Z e apostar em números pares ou ímpares.

## Como rodar o projeto sem Interface Grafica

1. Clone este repositório para o seu computador utilizando o seguinte comando no terminal:
git clone https://github.com/Luanfaske/Linguagens-de-Programacao

2. Navegue até o diretório do projeto:

3. Compile o código-fonte utilizando o seguinte comando:
javac Projetos/LotoFacil.java

4. Execute o programa Java utilizando o seguinte comando:
java Projetos.LotoFacil

5. Após executar o programa, você verá um menu com diferentes opções de apostas. Digite o número correspondente à opção desejada e pressione Enter para selecioná-la.

6. Dependendo da opção selecionada, o programa solicitará ao usuário que forneça uma entrada específica (número, letra, etc.). Digite a entrada solicitada e pressione Enter.

7. Após inserir a entrada necessária, o programa exibirá o resultado da aposta e qualquer mensagem de prêmio ou aviso relacionado.

8. Para sair do programa, digite `0` no menu e pressione Enter.

Certifique-se de interagir com o programa seguindo as instruções exibidas no terminal para realizar as apostas corretamente.

## Como rodar o projeto com Interface Grafica

1. Clone este repositório para o seu computador utilizando o seguinte comando no terminal:
git clone https://github.com/Luanfaske/Linguagens-de-Programacao

2. Navegue até o diretório do projeto:
cd Linguagens-de-Programacao

3. Compile o código-fonte utilizando o seguinte comando:
javac LotoFacil/LotoFacilInterfaceGrafica.java

4. Execute o programa Java utilizando o seguinte comando:
java LotoFacil.LotoFacilInterfaceGrafica

5. Após executar o programa, interaja com a interface gráfica para realizar as apostas corretamente.

## Bibliotecas utilizadas

Bibliotecas utilizadas projeto sem Interface Grafica:

- `java.io.IOException`: Biblioteca para lidar com exceções de entrada/saída de dados.
- `java.util.InputMismatchException`: Biblioteca para lidar com exceções de entrada inválida.
- `java.util.Random`: Biblioteca para gerar números aleatórios.
- `java.util.Scanner`: Biblioteca para ler entradas do usuário.

Bibliotecas utilizadas projeto com Interface Grafica:

- `java.awt.Color`: Manipula cores. 
- `java.awt.GridLayout`: Organiza componentes em uma grade retangular.
- `java.awt.event.ActionEvent`: Lida com eventos de ação na interface gráfica.
- `java.awt.event.ActionListener`: Lida com eventos de ação na interface gráfica.
- `javax.swing.JButton`: Permite criaçao de botões interativos na interface gráfica.
- `javax.swing.JFrame`: Cria janelas principais para aplicações Swing.
- `javax.swing.JLabel`: Exibção de texto ou imagens na interface gráfica.
- `javax.swing.JOptionPane`: Mostra caixas de diálogo pop-up na interface gráfica.
- `javax.swing.JPanel`: Agrupa e organiza componentes na interface gráfica.
- `javax.swing.SwingUtilities`: Fornece métodos de utilidade para programação Swing.
- `java.util.Random`: Utilizado para gerar números aleatórios.

## Versão do JDK

Este projeto foi desenvolvido utilizando Java Development Kit (JDK) versão 21.0.1.