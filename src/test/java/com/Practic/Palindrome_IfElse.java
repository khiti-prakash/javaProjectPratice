package com.Practic;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome_IfElse {
    /*
    Create a program that checks whether a given string is a palindrome. A palindrome is a word
 or phrase that reads the same backward as forward (ignoring spaces, punctuation, and
 capitalization). Use an if-else statement to determine if the string is a palindrome.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String value = sc.nextLine();
        sc.close();
//        StringBuffer sb= new StringBuffer(value);
//        sb.reverse();
        boolean status =true;
       // ArrayList arr = new ArrayList<String>();
        for (int i =0 ; i <  value.length()-1/2; i++) //we just verify half char and compair with half characters
        {
           if(value.charAt(i) != value.charAt(value.length()-1 -i))
           {
               status = false;
               break;
           }
        }
        if(status)
        {
            System.out.println(value +" :-It is a palindrome");
        }
        else
        {
            System.out.println(value +" :-It is not a palindrome");
        }
    }
}
