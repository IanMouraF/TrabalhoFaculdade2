import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    Estoque estoque = new Estoque();

    public void mostrarProdutos() {
        System.out.println("Atualmente temos " + estoque.getQuantidadeProdutos() + " produtos a venda!:");
        System.out.println(estoque.getProdutos());
    }

    private ArrayList<Produto> Carrinho = new ArrayList<>();

    public void adicionarAoCarrinho() {
        Scanner scan = new Scanner(System.in);

        int TamanhoPrintado = estoque.getProdutos().size() - 1;

        System.out.println("Qual deles você deseja adicionar ao carrinho? Digite o índice de 0 a " + TamanhoPrintado);
        int indice = scan.nextInt();

        Produto tempProduto = estoque.getProdutos().get(indice);
        Carrinho.add(tempProduto);
        System.out.println("Você adicionou o produto " + tempProduto.getNome() + " ao seu carrinho!");
    }
}
