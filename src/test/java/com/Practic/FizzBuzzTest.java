package com.Practic;
import java.io.IOException;
import java.util.Scanner;

public class FizzBuzzTest {
  /*  Write a program that prints numbers from 1 to 100. However,
      for multiples of 3, print "Fizz"
      instead of the number, and for multiples of 5,
      print "Buzz." For numbers that are multiples of
      both 3 and 5, print "FizzBuzz." */

    public static void main(String[] args)
    {
        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please enter a number only");

            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println(i + ":- is a FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println(i + ":- is a Fizz");
                } else if (i % 5 == 0) {
                    System.out.println(i + ":- is a Buzz");
                } else {
                    System.out.println(i + ":- is not a Fizz or Buzz");
                }
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Please enter number");
        }
    }

}
