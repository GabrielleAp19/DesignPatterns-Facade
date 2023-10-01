public class Produto {

    private String descricao;

    private int preco;

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto(String descricao, int preco){
        this.descricao = descricao;
        this.preco=preco;

    }

}
