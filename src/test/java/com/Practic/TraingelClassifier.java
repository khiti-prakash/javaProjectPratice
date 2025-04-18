package com.Practic;
import java.util.Scanner;

public class TraingelClassifier {
    /*
    Write a program that classifies a triangle based on its side lengths.Given three input values
 representing the lengths of the sides,determine if the triangle is equilateral (allsides are
 equal), isosceles(exactly two sides are equal),orscalene(no sides are equal).Use an
 if-else statement to classify the triangle.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 1st length");
        int first_length = sc.nextInt();

        System.out.println("Please Enter 2nd length");
        int second_length = sc.nextInt();

        System.out.println("Please Enter 3rd length");
        int third_length = sc.nextInt();

        sc.close();

        if(first_length == second_length && second_length == third_length)
        {
            System.out.println("triangle is equilateral");
        }
        else if (first_length != third_length && second_length != third_length && first_length != second_length) {
            System.out.println("triangle is orscalene");
        }
        else if (first_length != third_length || second_length != third_length || first_length != second_length) {

            System.out.println("triangle is isosceles");
        }
    }
}
