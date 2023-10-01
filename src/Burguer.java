import java.security.PublicKey;

public class Burguer extends Produto{

    int gramas;


    public Burguer(String descricao, int preco, int gramas) {
        super(descricao, preco);
        this.gramas= gramas;

    }
    public String toString() {
        return "Lanche: " + getDescricao() + "   " + "Valor: " + getPreco() + "   " + "Gramas: " + gramas;
    }

}