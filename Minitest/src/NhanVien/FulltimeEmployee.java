package NhanVien;

import javax.naming.Name;

public class FulltimeEmployee extends Employee {
    private double salary;
    private double fine;
    private double bonus;

    public FulltimeEmployee(int ID, String name, double telephoneNumber, String email, double salary, double fine, double extra) {
        super(ID, name, telephoneNumber, email);
        this.salary = salary;
        this.fine = fine;
        this.bonus = bonus;
    }

    public double calculateNetSalary() {
        return salary + (bonus - fine);
    }

}