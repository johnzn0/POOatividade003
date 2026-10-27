public class TesteCinema {
    public static void main(String[] args) {
        MeiaEntrada meia = new MeiaEntrada("Divertida Mente", 40, "carteira 123");
        Vip vip = new Vip("Duna", 40, "A");

        Ingresso[] ingressos = {meia, vip};
        for (Ingresso ingresso : ingressos) {
            System.out.println(ingresso.valorFinal());
        }

        System.out.println(meia.resumo());
        System.out.println(meia.resumo(true));
    }
}
