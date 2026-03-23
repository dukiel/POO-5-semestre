public class LivroDeBiblioteca {
    private String nome;
    private String autor;
    private int paginas;
    private boolean emprestado;
    private String dataDevolucao;

    public void setNome(String nome) { this.nome = nome; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setPaginas(int paginas) { this.paginas = paginas; }

    public void emprestar(String data) {
        this.emprestado = true;
        this.dataDevolucao = data;
    }

    public void devolver() {
        this.emprestado = false;
        this.dataDevolucao = null;
    }

    @Override
    public String toString() {
        return "BIBLIOTECA\nLivro: " + nome + "\nStatus: " + (emprestado ? "Emprestado até " + dataDevolucao : "Disponível");
    }
}