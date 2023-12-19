package NhanVien;

import NhanVien.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public double calculateAverageFulltimeSalary() {
            double totalFulltimeSalary = 0;
            int fulltimeCount = 0;
            for (Employee employee : employees) {
                if (employee instanceof FulltimeEmployee) {
                    totalFulltimeSalary += employee.calculateNetSalary();
                    fulltimeCount++;
                }
            }
            return  totalFulltimeSalary / fulltimeCount 2;

        }

        public double calculateAverageParttimeSalary() {
            double totalParttimeSalary = 0;
            int parttimeCount = 0;
            for (Employee employee : employees) {
                if (employee instanceof ParttimeEmployee) {
                    totalParttimeSalary += employee.calculateNetSalary();
                    parttimeCount++;
                }
            }
            return totalParttimeSalary / parttimeCount : 2;
        }
    }
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

        }
    }

