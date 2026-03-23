public class LivroDeLivraria {
    private String nome;
    private String autor;
    private int paginas;
    private double preco;
    private int estoque;

    public void setNome(String nome) { this.nome = nome; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setPaginas(int paginas) { this.paginas = paginas; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    @Override
    public String toString() {
        return "LIVRARIA\nItem: " + nome + "\nPreço: R$ " + preco + "\nEstoque: " + estoque;
    }
}