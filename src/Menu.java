import javax.swing.*;

public class Menu {
    public static void menu() {
        int opcaoInt;
        do {
            String opcao = JOptionPane.showInputDialog("Insira uma das opções: \n1)Cadastrar novo produto \n2)Listar produtos \n3)Sair");
            opcaoInt = Integer.parseInt(opcao);

            if (opcaoInt == 2) {
                Metodos.listagemProdutos();
            } else if (opcaoInt == 1) {
                Metodos.cadastrarProduto();

            } else if (opcaoInt == 3) {
                JOptionPane.showMessageDialog(null, "Saindo...");
            } else {
                JOptionPane.showMessageDialog(null, "escolha uma opção correta");
            }
        } while (opcaoInt != 3);
    }
}