public class TesteTransporte {
    public static void main(String[] args) {
        Van van = new Van("Centro", 15);
        OnibusEscolar onibus = new OnibusEscolar("Bairro", 2);

        Transporte[] transportes = {van, onibus};
        for (Transporte transporte : transportes) {
            System.out.println(transporte.anunciar());
        }

        System.out.println(van.lotacao(12));
        System.out.println(van.lotacao(12, 15));
    }
}
