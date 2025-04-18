package com.Practic;
import java.util.Scanner;

public class CountVowelAndConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = sc.nextLine();
try {
    int vowelCount = 0;
    int consonantCount = 0;
    for (int i = 0; i <= name.length() - 1; i++) {
        char ch = name.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        } else {
            consonantCount++;
        }
    }

    System.out.println(vowelCount + " vowel is present in " + name);
    System.out.println(consonantCount + " consonent is present in " + name);
    }
    catch (IllegalStateException i)
    {
    System.out.println("Please enter a name");
    }
    }

}
