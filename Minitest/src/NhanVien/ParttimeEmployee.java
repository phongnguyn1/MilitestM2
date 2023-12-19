package NhanVien;

public class ParttimeEmployee extends Employee {
    private int WorkingHours ;
    public ParttimeEmployee(int ID, String name, double telephoneNumber, String email,int WorkingHours){
        super(ID,name,telephoneNumber,email);
        this.WorkingHours=WorkingHours ;
    }
    public double calculateParttimeSalary() {
        return WorkingHours * 100000;
}
}
