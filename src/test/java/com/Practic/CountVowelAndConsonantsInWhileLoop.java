package com.Practic;
import java.util.Scanner;
public class CountVowelAndConsonantsInWhileLoop {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a name");
            String name = sc.nextLine();
            String nameInLower = name.toLowerCase();

            int vowelCount = 0;
            int consonantCount = 0;

            int i = 0;
            while (i <= nameInLower.length() - 1) {
                char ch = nameInLower.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
                  i++;
               // break;
            }

            System.out.println(vowelCount + " vowel is present in " + name);
            System.out.printf("%d consonant is present in %s", consonantCount, name);
        }
        catch (IllegalStateException i)
        {
            System.out.println("Please enter a name only");
        }
    }
}
