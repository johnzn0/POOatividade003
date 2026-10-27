public class TesteClinica {
    public static void main(String[] args) {
        Paciente carla = new Paciente("Carla", "Unimed");
        Medico diego = new Medico("Diego", "Clinica");

        Pessoa[] pessoas = {carla, diego};
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.ficha());
        }

        System.out.println(carla.agendar("12/10/2026"));
        System.out.println(carla.agendar("12/10/2026", "14:00"));
    }
}
