package com.bootcamp.management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(12, "Sylvia", 33, 500.00);

        System.out.println("Before withdrawal: " + student);
        student.withdraw(100.00);

        System.out.println(); // Add empty line for separation
        System.out.println("After withdrawal: " + student);

        student.deposit(200.0);

        List<Product> products = new ArrayList<Product>();
        products.add(new Product(101, "Laptop", 800.00, "Electronics", 50));
        products.add(new Product(102, "Microwave", 950.00, "Electronics", 40));
        products.add(new Product(501, "Coffee (Medium)", 3.50, "Food & Drinks", 150));
        products.add(new Product(104, "Pilot G2 Pens (Pack)", 12.99, "Stationery", 100));

        System.out.println(products);
    }
}
