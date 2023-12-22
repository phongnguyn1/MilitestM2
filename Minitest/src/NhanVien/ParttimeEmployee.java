package NhanVien;

public class ParttimeEmployee extends Employee {
    private int WorkingHours ;

    public int getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {
        WorkingHours = workingHours;
    }

    public ParttimeEmployee(int ID, String name, double telephoneNumber, String email, int WorkingHours){
        super(ID,name,telephoneNumber,email);
        this.WorkingHours=WorkingHours ;
    }

    @Override
    public double getPayment() {
        return WorkingHours * 100000;
    }

    public double calculateParttimeSalary() {
        return WorkingHours * 100000;
}
}
