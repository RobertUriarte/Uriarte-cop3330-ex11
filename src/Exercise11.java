/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euro = euros();
        System.out.printf("What is your exchange rate? ");
        double rate = rates();
        System.out.printf("%.2f at an exchange rate of %f\n", euro,rate);
        System.out.printf("%.2f U.S. dollars.", euro * rate);
    }

    static double euros(){
        Scanner scan = new Scanner(System.in);
        double euro2 = scan.nextDouble();
        return euro2;
    }
    static double rates() {
        Scanner scan = new Scanner(System.in);
        double rate2 = scan.nextDouble();
        return rate2;
    }
}

