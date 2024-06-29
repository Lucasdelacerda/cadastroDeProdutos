import javax.swing.*;
import java.awt.*;

//fazer uma interface em que mostre primeiro a listagem de produtos
//ordenar os produtos em preço do maior para o menor
// para isso acontecer será necessário fazer com métodos
public class Main {
    public static void main(String[] args) {
        //conficuração da tela
        JFrame frame = new JFrame("Cadastro de Produtos");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comportamento para encerramento da janela
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        JPanel painelInferior = new JPanel(new BorderLayout());

        //configuração dos botões
        JButton adicionarButton = new JButton("Cadastrar novo produto");
        //criando painés para deixar os botões sempre alinhados as bordas
        JPanel painelEsquerdo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelEsquerdo.add(adicionarButton);
        painelInferior.add(painelEsquerdo, BorderLayout.WEST);
        frame.add(painelInferior, BorderLayout.SOUTH);
        //em resumo acima foi feito a adição e posição dos painés e colocado os botões em cada painel e alinhado
        adicionarButton.setFont(new Font("Arial", Font.BOLD, 12));
        adicionarButton.ActionListener();
        frame.setVisible(true);
    }
}