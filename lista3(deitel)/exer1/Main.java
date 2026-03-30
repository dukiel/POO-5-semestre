public static void main(String[] args) {
    Employee[] employees = new Employee[3];

    employees[0] = new CommissionEmployee(
            "Daniel",
            "Souza",
            "111",
            10000,
            .06);
    employees[1] = new BasePlusCommissionEmployee(
            "Ana",
            "Silva",
            "222",
            5000,
            .04,
            300);
    employees[2] = new Pieceworker(
            "Bruno",
            "Costa",
            "333",
            2.5,
            200);

    System.out.println("Processamento Polimórfico:");

    for (Employee currentEmployee : employees) {
        System.out.println(currentEmployee);
        System.out.printf("Ganhos: R$ %.2f\n\n", currentEmployee.earnings());
    }
}