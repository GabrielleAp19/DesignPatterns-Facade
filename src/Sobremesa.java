public class Sobremesa extends Produto{
    String tamanho;


    public Sobremesa(String descricao, int preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }
    public String toString() {
        return "Sobremesa: " + getDescricao() + "   "+ "Valor: " + getPreco() + "   "+ "Tamanho: " + tamanho;
    }
}