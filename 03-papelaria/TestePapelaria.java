public class TestePapelaria {
    public static void main(String[] args) {
        Caderno caderno = new Caderno("Universitario", 20, 96);
        Caneta caneta = new Caneta("Bic", 5, "azul");

        Produto[] produtos = {caderno, caneta};
        for (Produto produto : produtos) {
            System.out.println(produto.descrever());
        }

        System.out.println(caderno.precoComDesconto(10));
        System.out.println(caderno.precoComDesconto(90, 8));
    }
}
