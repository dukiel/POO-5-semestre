public class Main {
        Produto p = new Produto();

        p.setNome("garfo");
        p.setPreco(10);

        p.atualizaPrecoPerc(0);
        p.fazerPromocao(5);

        System.out.println(p.toString());

    }
}