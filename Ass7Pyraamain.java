/*
 * Created by:- Nishkumar Patel
 * ID:- 21CE102
 * Aim:- Display numbers in a pyramid pattern.
 *                  1
 *                1 2 1
 *              1 2 4 2 1
 *            1 2 4 8 4 2 1
 *          1 2 4 8 16 8 4 2 1
 *       1 2 4 8 16 32 16 8 4 2 1
 *    1 2 4 8 16 32 64 32 16 8 4 2 1
 * 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 */

import java.util.*;

public class Ass7Pyraamain {
    public static void main(String[] args) {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8-1-i;j++)
            {
                System.out.print("    ");
            }
            double b = 0;
            for(int a=8;a>8-1-i;a--)
            {
                System.out.printf(" %3d",(int)Math.pow((double)2,b));
                b++;
            }
            double d = i-1;
            for(int c=9;c<9+i;c++)
            {
                System.out.printf(" %3d",(int)Math.pow((double)2,d));
                d--;
            }
            System.out.println("\n");
        }
        System.out.println("\nCreated by:- Nishkumar Patel         ID:-21CE102\n");
    }
}
