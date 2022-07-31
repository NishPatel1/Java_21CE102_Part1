/*
 * Created by:- Nishkumar Patel
 * ID:- 21CE102
 * Aim:- Given a string, return a string made of the first 2 chars (if present), however include 
 * first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
 * yields "oz".
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z"
 * startOz("oxx") → "o"
 */

import java.util.*;

public class Ass2Firstmain {
    
    public static String StartOz(String s)
{
    String s2 = s.substring(0, 2);
    if(s2.equalsIgnoreCase("oz"))
        return s2;
    else if(s2.contains("o"))
        return "o";
    else if(s2.contains("z"))
        return "z";
    else
        return null;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String ans = StartOz(s);
        if(ans!=null)
            System.out.println("The first 2 char(if present) is " + ans);
        System.out.println("\nCreated by:- Nishkumar Patel         ID:-21CE102\n");
    }
}
