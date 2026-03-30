public class Main {
    public static void main(String[] args) {

        CommissionEmployee ce = new CommissionEmployee(
                "João",
                "Silva",
                "123.456.789-00",
                10000.00,
                0.06
        );

        ce.setGrossSales(15000.0);
        ce.setCommissionRate(132);

        System.out.println("--- Dados do Empregado Comissionado ---");
        System.out.println(ce.toString());

        System.out.printf("Rendimentos: R$ %.2f%n", ce.earnings());
    }
}