public class Combo {

    public void CriarCombo(int tipo) {
        if (tipo == 1) {

            Bebida bebida = new Bebida("Fanta Laranja", 10, 600);
            Sobremesa sobremesa = new Sobremesa("Sorvete de Morango", 18, "Grande");
            Burguer burguer = new Burguer("X-Burguer", 15, 350);

            System.out.println("Super Combo");
            System.out.println(bebida);
            System.out.println(burguer);
            System.out.println(sobremesa);

            double precoTotal = bebida.getPreco() + burguer.getPreco() + sobremesa.getPreco();

            System.out.println("preço Total: " + precoTotal);

        } else if (tipo == 2) {

            Bebida bebida = new Bebida("Sprit", 6, 200);
            Sobremesa sobremesa = new Sobremesa("Sorvete de Flocos", 8, "Pequeno");
            Burguer burguer = new Burguer("X-Salada", 30, 350);

            System.out.println("Combo Master");
            System.out.println(bebida);
            System.out.println(burguer);
            System.out.println(sobremesa);
            double precoTotal = bebida.getPreco() + burguer.getPreco() + sobremesa.getPreco();
            System.out.println("preço Total: " + precoTotal);

        }
    }

    @Override
    public String toString() {
        return """
             ************************************
               Tenha um ótimo dia, Volte sempre
             ************************************
              """;
    }
}
