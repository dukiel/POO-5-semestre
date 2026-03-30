public class Pieceworker extends Employee {
    private double wage; // salário por peça
    private int pieces;  // quantidade de peças produzidas

    public Pieceworker(String firstName, String lastName, String socialSecurityNumber,
                       Date birthDate, double wage, int pieces) {

        super(firstName, lastName, socialSecurityNumber, birthDate);
        setWage(wage);
        setPieces(pieces);
    }

    public void setWage(double wage) {
        this.wage = (wage < 0.0) ? 0.0 : wage;
    }

    public double getWage() { return wage; }

    public void setPieces(int pieces) {
        this.pieces = (pieces < 0) ? 0 : pieces;
    }

    public int getPieces() { return pieces; }

    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: %.2f; %s: %d",
                "piece worker", super.toString(),
                "wage per piece", getWage(),
                "pieces produced", getPieces());
    }
}