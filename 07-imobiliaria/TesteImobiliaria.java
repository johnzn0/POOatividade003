public class TesteImobiliaria {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua A, 10", 80, 3);
        Apartamento apartamento = new Apartamento("Rua B, 200", 60, 5);

        Imovel[] imoveis = {casa, apartamento};
        for (Imovel imovel : imoveis) {
            System.out.println(imovel.descrever());
        }

        System.out.println(casa.valorEstimado(3000));
        System.out.println(casa.valorEstimado(3000, 2000));
    }
}
