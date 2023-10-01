public class Bebida extends Produto {

    int ml;

    public Bebida(String descricao, int preco, int ml) {
        super(descricao, preco);
        this.ml=ml;

    }
    @Override
    public String toString() {
        return "bebida: " + getDescricao() +"  " + "Valor: " + getPreco() +"  " + "ML: " +ml;
    }
}