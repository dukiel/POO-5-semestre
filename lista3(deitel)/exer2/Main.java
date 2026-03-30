import java.util.Calendar;

public void main() {
    Employee[] employees = new Employee[2];

    Date niverMarço = new Date(
            3,
            20,
            2003
    );
    Date niverMaio = new Date(
            5,
            10,
            1995
    );

    employees[0] = new Pieceworker(
            "Daniel",
            "Souza",
            "111",
            niverMarço,
            2.5,
            200
    );
    employees[1] = new CommissionEmployee(
            "Ana",
            "Silva",
            "222",
            niverMaio,
            10000,
            .06
    );

    int mesAtual = Calendar.getInstance().get(Calendar.MONTH) + 1;

    for (Employee current : employees) {
        double ganhos = current.earnings();

        if (current.getBirthDate().getMonth() == mesAtual) {
            ganhos += 100.00;
            System.out.println("PARABÉNS! Bônus de $100 aplicado.");
        }

        System.out.println(current);
        System.out.printf("Ganhos Totais: R$ %.2f\n\n", ganhos);
    }
}