package com.blz.employeepayrollservice.service;

import com.blz.employeepayrollservice.model.EmployeePayRoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService{
    Scanner scanner = new Scanner(System.in);
    List<EmployeePayRoll> employeePayrolls = new ArrayList<>();

    public static void main(String[] args) {
        EmployeePayRollService service = new EmployeePayRollService();
        service.readData();
        service.writeData();
    }

    private void readData() {
        EmployeePayRoll employeePayroll = new EmployeePayRoll();
        System.out.println("Enter Id");
        employeePayroll.setId(scanner.nextInt());
        System.out.println("Enter Name");
        employeePayroll.setName(scanner.next());
        System.out.println("Enter Salary");
        employeePayroll.setSalary(scanner.nextInt());
        employeePayrolls.add(employeePayroll);
    }

    private void writeData() {
        System.out.println(employeePayrolls);
    }
}