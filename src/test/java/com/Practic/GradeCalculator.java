package com.Practic;

import java.util.Scanner;

public class GradeCalculator {
    /*
 Writeaprogramthatcalculatesanddisplaysthelettergradeforagivennumericalscore
 (e.g.,A,B,C,D,orF)basedonthefollowinggradingscale:
 A:90-100
 B:80-89
 C:70-79
 D:60-69
 F:0-59
    */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number");
        Integer value = sc.nextInt();
        sc.close();

        GradeCalculator(value);
    }

    public static void GradeCalculator(Integer enterGrade)
    {
        if(enterGrade >= 90 && enterGrade <= 100)
        {
            System.out.println("Grade is :- A ");
        }
        else if (enterGrade >= 80 && enterGrade <= 89)
        {
            System.out.println("Grade is :- B ");
        }
        else if (enterGrade >= 70 && enterGrade <= 79)
        {
            System.out.println("Grade is :- C ");
        }
        else if (enterGrade >= 60 && enterGrade <= 69)
        {
            System.out.println("Grade is :- D ");
        }
        else if (enterGrade >= 0 && enterGrade <= 59)
        {
            System.out.println("Grade is :- F ");
        }
        else
        {
            System.out.println("Please enter a number 1 to 100");
        }
    }

}
