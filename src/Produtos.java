class Produtos {
    String nome;
    String descricao;
    double preco;
    String disponivel;

    public Produtos(String nome, String descricao, double preco, String disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrição(String descrição) {
        this.descricao = descricao;
    }

    public void setPreço(double preço) {
        this.preco = preco;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }
}
