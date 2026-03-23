public class Livro {
    private String name;
    private String autor;
    private int paginas;

    public String getName(){
        return name;
    }

    public String getAutor(){
        return autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    @Override
    public String toString(){
        return "--- Livro: " + name + " ---\n" + "autor: " + autor + "Paginas: " +paginas;
    }
}
