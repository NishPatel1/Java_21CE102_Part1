/*
**  Created By:- Nish Patel
**  ID:- 21CE102
**
*/

import java.util.Scanner;
public class Mobilemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");
        String s1 = sc.next();
        String s2 = s1.substring(4, 6);
        String s3 = s1.substring(7, 10);
        String s4 = s1.substring(11, 16);
        System.out.println("Mobile system operator code is "+s2);
        System.out.println("MSC is "+s3);
        System.out.println("Unique code is "+s4);
        System.out.println("\nCreated by:- Nishkumar Patel         ID:-21CE102\n");
    }
}
