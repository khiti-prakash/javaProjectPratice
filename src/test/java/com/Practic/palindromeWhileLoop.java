package com.Practic;

import java.util.Scanner;

public class palindromeWhileLoop {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String value = sc.nextLine();
        sc.close();

        boolean status = true;
        int start =0;
        int end =value.length()-1;
        while(start < end)
        {
             if(value.charAt(start) != value.charAt(end))
             {
                 status =false;
                 break;
             }
             start++;
             end--;
        }
        if(status)
        {
            System.out.println(value + ":- It is a palindrome");
        }
        else
        {
            System.out.println(value + ":- It is not a palindrome");
        }
    }
}
