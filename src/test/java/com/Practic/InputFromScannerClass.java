package com.Practic;
import java.util.Scanner;

public class InputFromScannerClass {
    // User want to give any number or name or special charcters, that need to print
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any thing");
        try {
        String  value = sc.nextLine();
        System.out.println("Enter value is:- "+value);
        }
        catch (Exception e)
        {
            System.out.println("You have enter a wrong value");
        }
        finally {
            sc.close(); // Always good practice to close the scanner
        }
    }
}
