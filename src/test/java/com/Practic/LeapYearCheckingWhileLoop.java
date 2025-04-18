package com.Practic;

import java.util.Scanner;

public class LeapYearCheckingWhileLoop {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        Integer year = sc.nextInt();


        while ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            //if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            //    System.out.printf("%d is a leap year", year);
           // }
            System.out.printf("%d is a leap year%n", year);
            System.out.println("Enter another year:");
            year = sc.nextInt();  // get next input
        }

        System.out.println(year + " is not a leap year");
        sc.close();
    }
}
