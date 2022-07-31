/*
 * Created by:- Nishkumar Patel
 * ID:- 21CE102
 * Aim:- Given an array of strings, return a new array without the strings that are equal to 
 * the target string. One approach is to count the occurrences of the target string, make 
 * a new array of the correct length, and then copy over the correct strings.
 * wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
 * wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
 * wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */

import java.util.*;

public class Ass6Targetmaqin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the target string: ");
        String s2 = sc.nextLine();
        int a = s1.length(),b = 0;
        for(int i=0;i<a;i++)
        {
            if(s1.charAt(i)==s2.charAt(0))
            b++;
        }
        char[] target = new char[a-b];
        int j = 0;
        for(int i=0;i<a;i++)
        {
            if(s1.charAt(i)!=s2.charAt(0))
            {    
                target[j]=s1.charAt(i);
                j++;
            }
        }
        System.out.println("The New string is " + target);
        System.out.println("\nCreated by:- Nishkumar Patel         ID:-21CE102\n");
    }
}
