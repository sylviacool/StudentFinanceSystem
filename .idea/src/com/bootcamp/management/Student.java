package com.bootcamp.management;

public class Student {
    private int id;
    private String name;
    private int age;
    private double balance; // This represents their "account" for now


    public Student (int id, String name, int age, double balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {  // amount comes from method call
        if (amount <= this.balance) {      // this.balance comes from object creation
            this.balance -= amount;  // update the stored balance
            System.out.println("Take your cash: $" + amount);
            System.out.println("Remaining balance: $" + this.balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount sucessfully deposited");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Balance: $" + String.format("%.2f", balance);
    }
  }
