package com.practice.java8;

import com.practice.dao.EmployeeDAO;
import com.practice.entity.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        List<Employee> employeeList = employeeDAO.getAllEmployees();

        employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()))
                .entrySet()
                .forEach((employee) -> System.out.println(employee));
        // OR
        employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName))
                .entrySet()
                .forEach((employee) -> System.out.println(employee));

        // OR
        employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, employee -> employee))
                .forEach((key, value) -> System.out.println(key+" : "+value));
    }
}
