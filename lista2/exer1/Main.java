public class Main {
    public static void main(String[] args) {

        // Instanciando CommissionEmployee [cite: 78, 79]
        CommissionEmployee ce = new CommissionEmployee(
                "João",
                "Silva",
                "123.456.789-00",
                10000.00,
                0.06
        );

        // Exibindo dados (chama o toString que invoca o super.toString) [cite: 74, 78]
        System.out.println("--- Dados do Empregado Comissionado ---");
        System.out.println(ce.toString());

        // Exibindo rendimentos específicos [cite: 73]
        System.out.printf("Rendimentos: R$ %.2f%n", ce.earnings());
    }
}