public class Cliente {
    private String cpf;
    private String nome;
    private int telefone;
    private String endereco;
    private boolean mensagemPromocional;

    public Cliente(String cpf, String nome, int telefone, String endereco, boolean mensagemPromocional) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.mensagemPromocional = mensagemPromocional;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isMensagemPromocional() {
        return mensagemPromocional;
    }

    public void setMensagemPromocional(boolean mensagemPromocional) {
        this.mensagemPromocional = mensagemPromocional;
    }

    public void verProdutos() {

    }

    public void adicionarCarrinho() {

    }

    public void enderecoPadrao() {

    }
}
