public class TesteBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 1899, 256);
        Revista revista = new Revista("Ciencia Hoje", 2024, 301);

        Publicacao[] publicacoes = {livro, revista};
        for (Publicacao publicacao : publicacoes) {
            System.out.println(publicacao.citar());
        }

        System.out.println(livro.emprestar(7));
        System.out.println(livro.emprestar(7, "Ana"));
    }
}
