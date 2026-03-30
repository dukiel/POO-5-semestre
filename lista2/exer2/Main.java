public static void main(String[] args) {
    BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(
            "Daniel",
            "Souza",
            "999.888.777-11",
            5000.0,
            0.1,
            300.0
    );

    System.out.println(bpce.toString());
    System.out.printf("Total a receber: R$ %.2f%n", bpce.earnings());
}