package SistemaLivraria;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private boolean aberto;
    private String genero;
    private Autor autor;
    private Editora editora;
    private int paginaAtual;
    private int anoPublicacao;

    public Livro(String titulo, int totalPaginas, String genero, Autor autor, Editora editora, int anoPublicacao) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = 0;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String listarDados() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", aberto=" + aberto +
                ", genero='" + genero + '\'' +
                ", autor=" + autor.listarDados() +
                ", editora=" + editora.listarDados() +
                ", paginaAtual=" + paginaAtual +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    public int proximaPagina(int paginaAtual){
        if(this.aberto){
            this.paginaAtual = paginaAtual + 1;
            return  this.paginaAtual;
        }
        return 0;
    }

    public int paginaAnterior(int paginaAtual){
        //se o livro estiver aberto
        // aberto == true
        if(this.aberto){
            this.paginaAtual = paginaAtual - 1;
            return  this.paginaAtual;
        }
        return 0;
    }

    public void abrirLivro(){
        this.aberto = true;
    }

    public void fecharLivro(){
        if(this.aberto == true){
            this.aberto = false;
        }
    }

    public void folhear(int pagina){
        if(this.aberto){
            if(pagina <= this.totalPaginas) {
                this.paginaAtual = pagina;
            }
        }
        else {
            System.out.println("LIVRO FECHADO");
        }
    }




}
