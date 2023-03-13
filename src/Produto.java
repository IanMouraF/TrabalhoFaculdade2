public class Produto {
    private String nome;
    private String descricao;
    private String tipo;
    private String cor;
    private String caracteristica;
    private double valorDeCusto;
    private double lucro;

    private int qestoque;


    public Produto(String nome, String descricao, String tipo, String cor, String caracteristica, double valorDeCusto, double lucro, int qestoque) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setTipo(tipo);
        this.setCor(cor);
        this.setCaracteristica(caracteristica);
        this.setValorDeCusto(valorDeCusto);
        this.setLucro(lucro);
        this.setQestoque(qestoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public double getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public int getQestoque() {
        return qestoque;
    }

    public void setQestoque(int qestoque) {
        this.qestoque = qestoque;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", caracteristica='" + caracteristica + '\'' +
                ", valorDeCusto=" + valorDeCusto +
                ", lucro=" + lucro +
                ", qestoque=" + qestoque +
                "}\n";
    }
}
