public class main {
    public static void main(String[] args){
        Livro l = new Livro();

        l.setName("My Code");
        l.setAutor("Dukiel LC");
        l.setPaginas(1337);

        System.out.println(l.toString());
    }
}