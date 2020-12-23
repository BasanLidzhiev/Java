package com.company;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Hr", "pepetr@mailbox.com", "892312123", 20000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Tech Support", "sisidr@mailbox.com", "892312345", 25000, 41);
        employees[3] = new Employee("Filimonov Filipp", "Account Manager", "fifil@mailbox.com", "892312678", 11000, 25);
        employees[4] = new Employee("Pafnutyev Pafnutiy", "Sales Manager", "pafpaf@mailbox.com", "892312492", 24000, 48);
        for (Employee employee : employees) {
            if (employee.age > 40){
                System.out.println(employee);
            }

        }
    }


}
