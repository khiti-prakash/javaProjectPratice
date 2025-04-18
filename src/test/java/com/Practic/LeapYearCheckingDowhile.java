package com.Practic;
import java.util.Scanner;

public class LeapYearCheckingDowhile {

    public static void main(String[] args)
    {
        leapYear();
    }

    public static void leapYear()
    {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Please enter a year");

            Integer year = sc.nextInt();

            if((year % 4 ==0 && year % 100 !=0)  || (year % 400 ==0))
            {
                System.out.printf("%d is a leap year%n",year);
            }
            else
            {
                System.out.println(year + " it is not a leap year");
            }

            // Want to ask for other check
            System.out.print("Do you want to check another year? (y/n): ");
            choice = sc.next().charAt(0);
        }

        while (choice == 'y' || choice == 'Y');
        sc.close();
        System.out.println("Program is completed");


    }
}
