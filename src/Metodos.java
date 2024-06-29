import javax.swing.*;
import java.util.ArrayList;

public class Metodos {
    static ArrayList<Produtos> listarProdutos = new ArrayList<>();
    public static void listagemProdutos() {
        StringBuilder mensagem = new StringBuilder();
        for (Produtos produto : listarProdutos) {
            mensagem.append("Nome: ").append(produto.getNome()).append("\n")
                    .append("Descrição: ").append(produto.getDescricao()).append("\n")
                    .append("Preço: ").append(produto.getPreco()).append("\n")
                    .append("Disponibilidade: ").append(produto.getDisponivel()).append("\n")
                    .append("------------").append("\n");

        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Lista de Produtos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cadastrarProduto() {
        String nome = JOptionPane.showInputDialog("Insira o nome do produto: ");
        String descricao = JOptionPane.showInputDialog("Insira a descrição do produto: ");
        String preco = JOptionPane.showInputDialog("Insira o preço do produto: ");
        String disponibilidade = JOptionPane.showInputDialog("o produto está disponível para venda? (1-Sim 2-não) ");
        double precoDouble = Double.parseDouble(preco);
        String disponivel = null;
        if (disponibilidade == "1") {
            disponivel = "Sim";
        } else {
            disponivel = "Não";
        }
        listarProdutos.add(new Produtos(nome, descricao, precoDouble, disponivel));
    }
}
