package com.practice.java8;

import com.practice.dao.EmployeeDAO;
import com.practice.entity.Employee;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDataOperations {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        List<Employee> employees = employeeDAO.getAllEmployees();

//        maleAndFemaleEmployeesCount(employees);
//        printAllDepartments(employees);
//        averageAgeOfMaleAndFemaleEmployees(employees);
        detailsOfHighPaidEmployee(employees);
        employeesJoinedAfter(employees);
        countOfEmployeesInEachDept(employees);
        averageSalaryOfEachDept(employees);
        detailsOfYoungestEmployeeByGenderAndDept(employees);
        mostExperiencedInOrganization(employees);
        countOfMaleAndFemalEmpByDept(employees);
        averageSalaryOfMaleAndFemaleEmployees(employees);
        namesOfAllEmployeesInEachDept(employees);
    }

    // Male and Female Employees count
    public static void maleAndFemaleEmployeesCount(List<Employee> employees) {

        long maleCount = employees.stream().filter((employee -> employee.getGender().equals("Male"))).count();
        long femaleCount = employees.stream().filter((employee -> employee.getGender().equals("Female"))).count();

        System.out.println("No of Female Employees: "+femaleCount);
        System.out.println("No of Male Employees: "+maleCount);

        Map<String, Long> averageAgeOfEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(averageAgeOfEmployees);

        averageAgeOfEmployees.forEach((key, value)-> System.out.println(key+": "+value));

    }
    // Print the name of all Departments in the organization
    public static void printAllDepartments(List<Employee> employees){

        employees.stream().map((employee -> employee.getDepartment())).distinct().forEach((dept) -> System.out.print(dept+", "));
    }

    // Average age of Male and Female Employees
    public static void averageAgeOfMaleAndFemaleEmployees(List<Employee> employees){

        Map<String, Double> avgAgeOfEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAgeOfEmployees);

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
                .forEach((key, value) -> System.out.println(key+":"+value));

    }

    // Get the details of the highest paid employee
    public static void detailsOfHighPaidEmployee(List<Employee> employees){

      Optional<Employee> employee = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
      System.out.println(employee);

      // Best option  - Use Collectors.max()
      // TODO
        Employee employee1 = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();

        System.out.println("Highest paid employee: "+employee1);
    }

    // Get the names of all employees who have joined after 2015
    public static void employeesJoinedAfter(List<Employee> employees){

        employees.stream()
                .filter((employee -> employee.getYearOfJoining() > 2015))
                .map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
    }

    // Count the number of employees in each Department
    public static void countOfEmployeesInEachDept(List<Employee> employees){

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }

    // What is the average salary of each department?
    public static void averageSalaryOfEachDept(List<Employee> employees){

        System.out.println("*****Average Salary Of Each Department*****");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .forEach((employee) -> System.out.println(employee));
    }

    // Get the details of youngest male employee in the product development department?
    public static void detailsOfYoungestEmployeeByGenderAndDept(List<Employee> employees){

        System.out.println("*****Details of youngest male employee*****");
        Employee  employee = employees.stream()
                .filter((employee1 -> employee1.getGender().equals("Female") && employee1.getDepartment().equals("HR")))
                .min(Comparator.comparing(Employee::getAge))
                .get();

        System.out.println(employee);
    }

    // Who has the most working experience in the organization?
    public static void mostExperiencedInOrganization(List<Employee> employees){

        System.out.println("*****Most experienced in organization*****");
        Employee  employee = employees.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining))
                .get();
        // Or use sort and findfirst()
        // employees.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        System.out.println(employee);
    }

    // How many male and female employees are there in the sales and marketing team?
    public static void countOfMaleAndFemalEmpByDept(List<Employee> employees){

        System.out.println("*****Count of Male and Female Employees in a Department*****");
        employees.stream()
                 .filter(employee -> employee.getDepartment().equals("Product Development"))
                 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                         .entrySet().forEach((emp) -> System.out.println(emp));
    }

    // What is the average salary of male and female employees?
    public static void averageSalaryOfMaleAndFemaleEmployees(List<Employee> employees){

        System.out.println("*****Average salary of Male and Female employees*****");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().forEach((emp) -> System.out.println(emp));

    }

   // List down the names of all employees in each department?
    public static  void  namesOfAllEmployeesInEachDept(List<Employee> employees){

        System.out.println("*****Names of all employees in each department*****");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((k, v) -> System.out.println(k+": "+v));
    }
}
