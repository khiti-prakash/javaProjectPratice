package com.Practic;
import java.util.Scanner;

public class TablePrinting {
    //Table Print using System.out.printf
    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number");
            int value = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d\n", value, i, value * i);
            }
        }
        catch(IllegalStateException e){
            System.out.println("Please enter number only");
        }

    }
}
