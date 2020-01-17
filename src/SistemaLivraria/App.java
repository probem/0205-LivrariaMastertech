package SistemaLivraria;

public class App {
    public static void main(String[] args) {
        Autor autor = new Autor(
                "Yuval",
                "Harari",
                "geral",
                'M',
                "Israel",
                "NA",
                50);

        Editora editora = new Editora(
                "Harper",
                1950,
                "3298432/0001",
                "Avenida Paulista",
                "Israel",
                "SSPJ"
        );

        Livro livro = new Livro(
                "Sapiens",
                443,
                "Não ficção",
                autor,
                editora,
                2011
        );
        livro.abrirLivro();
        livro.folhear(2);
        livro.proximaPagina(livro.getPaginaAtual());
        livro.proximaPagina(livro.getPaginaAtual());
        livro.proximaPagina(livro.getPaginaAtual());
        livro.paginaAnterior(livro.getPaginaAtual());

        System.out.println(livro.listarDados());
    }
}
