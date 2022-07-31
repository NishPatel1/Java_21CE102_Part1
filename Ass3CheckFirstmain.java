/*
 * Created by:- Nishkumar Patel
 * ID:- 21CE102
 * Aim:- Given two non-negative int values, return true if they have the same last digit, such 
 * as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 
 * 10 is 7.
 * lastDigit(7, 17) → true
 * lastDigit(6, 17) → false
 * lastDigit(3, 113) → true
 */

import java.util.*;

public class Ass3CheckFirstmain {
    
    public static int firstdigitvalue(int a){
        int fn=0;
        while(a!=0){
            fn = a%10;
            a /= 10;
        }
        return fn;
    }

    public static boolean firstdigit(int a, int b){
        int af = firstdigitvalue(a);
        int bf = firstdigitvalue(b);
        if(af==bf)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();  
        if(firstdigit(n1, n2))
            System.out.println("The first digit of number "+n1+" and number "+n2+" is same.");
        else
        System.out.println("The first digit of number "+n1+" and number "+n2+" is not same.");   
        System.out.println("\nCreated by:- Nishkumar Patel         ID:-21CE102\n"); 
    }
}
