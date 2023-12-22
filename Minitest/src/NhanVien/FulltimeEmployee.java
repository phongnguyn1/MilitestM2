package NhanVien;

public class FulltimeEmployee extends Employee {
    private double salary;
    private int fine;
    private int bonus;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public FulltimeEmployee(String ID, String name, int telephoneNumber, String email, int salary, int fine, int bonus) {
        super(ID, name, telephoneNumber, email);
        this.salary = salary;
        this.fine = fine;
        this.bonus = bonus;
    }

    @Override
    public double getPayment() {
        return salary + (bonus - fine);
    }

}
