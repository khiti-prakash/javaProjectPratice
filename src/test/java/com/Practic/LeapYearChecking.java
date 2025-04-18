package com.Practic;
import java.util.Scanner;

public class LeapYearChecking {
    public static void main(String[] args)
    {
        /*
         Create a program that determines whether a given year is a leap year.A leap year is
         divisible by 4,but not by 100 unless it is also divisible by400.Use an if-else statement to
         make this determination.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year");
        Integer year = sc.nextInt();
        sc.close();


        if((year % 4 == 0 && year % 100 !=0 )|| (year % 400 ==0))
        {
            System.out.printf(" %d is a leap year%n",year);
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}
