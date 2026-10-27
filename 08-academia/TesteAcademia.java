public class TesteAcademia {
    public static void main(String[] args) {
        Corredor lia = new Corredor("Lia", 10);
        Nadador paulo = new Nadador("Paulo", "crawl");

        Atleta[] atletas = {lia, paulo};
        for (Atleta atleta : atletas) {
            System.out.println(atleta.apresentar());
        }

        System.out.println(lia.registrarTempo(55.2));
        System.out.println(lia.registrarTempo(58, "100m"));
    }
}
