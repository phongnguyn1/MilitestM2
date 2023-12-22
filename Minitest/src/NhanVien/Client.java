package NhanVien;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int leng = 4;
        Employee[] employeeArray = new Employee[leng];
        employeeArray[0] = new FulltimeEmployee("E1", "Phong", 1, "phon1g.mail", 50000, 1000, 60000);
        employeeArray[1] = new FulltimeEmployee("E2", "Phong2", 12, "phon2g.mail", 40000, 1000, 60000);
        employeeArray[2] = new FulltimeEmployee("E3", "Phong3", 13, "phon3g.mail", 50003, 1000, 60000);
        employeeArray[3] = new FulltimeEmployee("E4", "Phong4", 14, "phon4g.mail", 50077, 1000, 60000);
        showMenu(employeeArray);
    }

    private static void showMenu(Employee[] employeeArray) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tính trung bình lương của nhân viên cả công ty");
            System.out.println("2. Tính trung bình lương của nhân viên fulltime");
            System.out.println("3. Tính trung bình lương của nhân viên parttime");
            System.out.println("4. Tính tổng lương phải trả cho nhân viên parttime");
            System.out.println("5. Đếm số người có mức lương cao hơn mức lương trung bình toàn công ty");
            System.out.println("6. Đếm số nhân viên parttime theo tên");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    getAverageSalary(employeeArray);
                    break;
                case 2:
                    getAverageFulltimeSalary(employeeArray);
                    break;
                case 3:
                    getAverageParttimeSalary(employeeArray);
                    break;
                case 4:
                    getSumParttimeSalary(employeeArray);
                    break;
                case 5:
                    countHighSalaryEmployees(employeeArray);
                    break;
                case 6:
                    countParttimeEmployeesbyName(employeeArray);
                    break;
                case 0:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 0);
    }

    private static double getAverageSalary(Employee[] employeeArray) {
        double sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.getPayment();
        }
        double avg = sum / employeeArray.length;
        System.out.println("Average salary " + avg);
        return sum;
    }

    private static void getAverageFulltimeSalary(Employee[] employeeArray) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employeeArray) {
            if (employee instanceof FulltimeEmployee) {
                count++;
                sum += employee.getPayment();
            }
        }
        if (count != 0) {
            double avg = sum / count;
            System.out.println("Trung bình lương fulltime: " + avg);
        }

    }
    private static void getAverageParttimeSalary(Employee[] employeeArray) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employeeArray) {
            if (employee instanceof FulltimeEmployee) {
                count++;
                sum += employee.getPayment();
            }
        }
        if (count != 0) {
            double avg = sum / count;
            System.out.println("Trung bình lương Parttime  " + avg);
        }

    }
    private static void getSumParttimeSalary(Employee[] employeeArray) {
        double sum = 0;
        for (Employee employee : employeeArray) {
            if (employee instanceof ParttimeEmployee) {
                sum += employee.getPayment();
            }
        }
        System.out.println("SumSalary parttime: " + sum);
    }

    private static void countHighSalaryEmployees(Employee[] employeeArray) {
        double avgSalary= getAverageSalary(employeeArray);
        int count = 0;
        for (Employee employee : employeeArray) {
            if (employee.getPayment() > avgSalary) {
                count++;
            }
    }
        }
        private static void countParttimeEmployeesbyName(Employee[]employees){
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            int count = 0;
            for (Employee employee : employees) {
                if (employee instanceof Employee)

                    count ++ ;
        }
}
    }
