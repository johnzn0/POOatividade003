public class TesteEscola {
    public static void main(String[] args) {
        Professor ana = new Professor("Ana", 3000, "POO");
        Coordenador bruno = new Coordenador("Bruno", 4500, "Pedagogico");

        Funcionario[] funcionarios = {ana, bruno};
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.descrever());
        }

        System.out.println(ana.bonificacao());
        System.out.println(ana.bonificacao(20));
    }
}
