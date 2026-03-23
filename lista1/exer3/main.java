public class main{
    public static void main(String[] args){
        Produto s = new Produto();
        s.setName("lampada");
        s.vender();

        System.out.println(s.toString());
    }
}