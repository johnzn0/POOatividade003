public class TesteLanchonete {
    public static void main(String[] args) {
        Lanche lanche = new Lanche("X-burguer", 18, 2);
        Bebida bebida = new Bebida("Suco", 8, 300);

        Item[] itens = {lanche, bebida};
        for (Item item : itens) {
            System.out.println(item.descrever());
        }

        System.out.println(lanche.total());
        System.out.println(lanche.total(2));
    }
}
