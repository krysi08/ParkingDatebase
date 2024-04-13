package com.example.parkingcardatabase;

public class PriceList {
    public static void main(String[] args) {

        PriceList list = new PriceList();

        list.settleCostsParking(7);
    }

    public void settleCostsParking(double timeParking) {
        if (timeParking >= 10.00 && timeParking <= 60.00) {
            System.out.println("Please pay off 5EUR");
        } else if (timeParking > 60.00) {
            double valueCosts = timeParking * 5 / 60.00;
            System.out.println("You have to pay off" + " " + valueCosts + " " + "EUR");
        } else {
            System.out.println("No fees");
        }
    }
        double howlong;
}
