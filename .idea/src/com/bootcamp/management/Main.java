package com.bootcamp.management;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(12, "Sylvia", 33, 500.00);

        System.out.println("Before withdrawal: " + student);
        student.withdraw(100.00);

        System.out.println(); // Add empty line for separation
        System.out.println("After withdrawal: " + student);

        student.deposit(200.0);


    }
}
