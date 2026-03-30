public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // salário de base por semana

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        // Envia os dados para o construtor da superclasse (CommissionEmployee)
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        setBaseSalary(baseSalary); // valida e armazena o salário-base
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