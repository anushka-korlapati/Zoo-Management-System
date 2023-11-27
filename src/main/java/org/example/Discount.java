package org.example;


public class Discount {
    private int serialNumber;
    private String lessGreat; // Modify the type to String
    private String category;
    private int age;
    private int discountRate;
    private String discountCode;

    private static int discountCounter = 0;

    public Discount(String lessGreat, int age, String category, int discountRate) {
        this.serialNumber = generateUniqueSerialNumber();
        this.lessGreat = lessGreat;
        this.age = age;
        this.category = category;
        this.discountRate = discountRate;
        this.discountCode = (category).toUpperCase() + discountRate; // Generate the discount code
    }

    private int generateUniqueSerialNumber() {
        return ++discountCounter;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getLessGreat() {
        return lessGreat;
    }

    public void setLessGreat(String lessGreat) {
        this.lessGreat = lessGreat;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void displayDiscount() {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Code: " + discountCode);
    }
}
