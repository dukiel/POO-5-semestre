public class Main {
        public void main() {
                Produto p = new Produto();
                p.setNome("Garfo");
                p.setPreco(10.0);

                // Usando os GETS para imprimir separadamente
                System.out.println("Nome do produto: " + p.getNome());
                System.out.println("Preço original: " + p.getPreco());


                System.out.println(p.toString());
        }
}
