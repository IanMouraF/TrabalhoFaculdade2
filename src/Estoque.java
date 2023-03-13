import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> Produtos = new ArrayList<Produto>();

    private Produto adicionarProduto(String nome, String descricao, String tipo, String cor, String caracteristica, double valorDeCusto, double lucro, int quantidadeEstoque) {
        Produto p = new Produto(nome, descricao, tipo, cor, caracteristica, valorDeCusto, lucro, quantidadeEstoque);
        Produtos.add(p);
        quantidadeProdutos = Produtos.size();
        return p;
    }

    public void deletarProduto(Object o) {
        Produtos.remove(o);
        quantidadeProdutos = Produtos.size();
    }

    Produto luva = adicionarProduto("Luva", "luva para frio", "vestimenta",
            "preta", "tricô", 30, 0.1, 100);

    Produto perfume = adicionarProduto("Desodorante Colônia de Lavanda", "perfume de lavanda",
            "perfume", "roxo", "300ml", 189, 0.3, 15);

    Produto bola = adicionarProduto("Bola de basquete", "A bola perfeita para jogar na quadra com os amigos", "esporte",
            "laranja", "couro", 40, 0.1, 30);

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    private int quantidadeProdutos = Produtos.size();

    public ArrayList<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        Produtos = produtos;
    }
}
