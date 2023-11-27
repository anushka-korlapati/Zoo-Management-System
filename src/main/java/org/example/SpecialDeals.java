package org.example;

public class SpecialDeals{

    private int noOfAttractions;

    private int discountRate;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private int serialNumber;

    private static int dealCounter = 0;


    public int getNoOfAttractions() {
        return noOfAttractions;
    }

    public void setNoOfAttractions(int noOfAttractions) {
        this.noOfAttractions = noOfAttractions;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    private int generateUniqueSerialNumber() {
        return ++dealCounter;
    }

    public SpecialDeals(int noOfAttractions, int discountRate){
        this.serialNumber = generateUniqueSerialNumber();
        this.noOfAttractions = noOfAttractions;
        this.discountRate = discountRate;
    }

    public void displaySpecialDeals(){
        System.out.println("S.no :"+serialNumber);
        System.out.println("More than: "+noOfAttractions+" attractions");
        System.out.println("Discount: "+discountRate);

    }


}
