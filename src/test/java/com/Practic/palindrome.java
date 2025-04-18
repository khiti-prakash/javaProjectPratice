package com.Practic;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        String value = sc.nextLine();

        sc.close();

        for (int i =0; i<value.length()-1/2; i++)
        {
            if (value.charAt(i)!= value.charAt(value.length()-1-i))
            {
                System.out.println("It is not palandrom");
            }
        }
        System.out.println("It is palandrom");
    }
}
