package org.example;

import java.util.Scanner;

public class Visitor implements User {
    private static int visitorCounter = 0;
    private int generateUniqueSerialNumber() {
        return ++visitorCounter;
    }

    private String Email;
    private String Name;
    private int Balance;
    private int Age;
    private int Phone_no;
    private String password;
    private int serialNo;
    private int noOfAttractions;
    private String memLevel;
    private String feedback;

    public Visitor() {
        this.serialNo = generateUniqueSerialNumber();
    }

    public String getUsername() {
        return Email;
    }

    public void setUsername(String username) {
        Email = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        setName(scanner.nextLine());
        System.out.println("Enter Email: ");
        setEmail(scanner.nextLine());
        System.out.println("Enter Age: ");
        setAge(scanner.nextInt());
        System.out.println("Enter Balance: ");
        setBalance(scanner.nextInt());
        System.out.println("Enter Phone Number: ");
        setPhone_no(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Password: ");
        setPassword(scanner.nextLine());
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(int phone_no) {
        Phone_no = phone_no;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public int getNoOfAttractions() {
        return noOfAttractions;
    }

    public void setNoOfAttractions(int noOfAttractions) {
        this.noOfAttractions = noOfAttractions;
    }

    public String getMemLevel() {
        return memLevel;
    }

    public void setMemLevel(String memLevel) {
        this.memLevel = memLevel;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}