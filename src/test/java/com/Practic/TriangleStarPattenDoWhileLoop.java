package com.Practic;
import java.util.Scanner;
public class TriangleStarPattenDoWhileLoop {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number");
        Integer col = sc.nextInt();
        Integer row =1;

        do{
           int i =1;
           while (i <= row)
           {
               System.out.print("*");
               i++;
           }
           row++;
            System.out.println();
        }while(row <= col);
    }
}
