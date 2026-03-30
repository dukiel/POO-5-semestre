public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // salário de base por semana

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      Date birthDate, double grossSales, double commissionRate,
                                      double baseSalary) {

        // Passa os 6 argumentos para o CommissionEmployee
        super(firstName, lastName, socialSecurityNumber, birthDate, grossSales, commissionRate);

        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }

    public double getBaseSalary() { return baseSalary; }

    @Override
    public double earnings() {
        // Adiciona o salário base aos ganhos da comissão
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }
}