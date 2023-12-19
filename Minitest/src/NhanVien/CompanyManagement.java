package NhanVien;

import NhanVien.Employee;

import java.util.ArrayList;
import java.util.Scanner;


public class CompanyManagementSystem {
    private ArrayList<Employee> employees;

    public CompanyManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }




