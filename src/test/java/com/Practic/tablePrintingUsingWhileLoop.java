package com.Practic;
import java.util.Scanner;

public class tablePrintingUsingWhileLoop {
    //Table Print using System.out.printf (While Loop)
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number only");
        int value = sc.nextInt();
        int num =1;

        while(num<=10)
        {
            System.out.printf("%d * %d = %d\n ", value, num, value * num);
            num++;
        }

    }

}
