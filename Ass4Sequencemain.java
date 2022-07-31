/*
 * Created by:- Nishkumar Patel
 * ID:- 21CE102
 * Aim:- Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the 
 * array somewhere.
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 */

import java.util.*;

public class Ass4Sequencemain {
    
public static boolean contains123(int[] arr, int length)
{
    for(int i=0;i<length-2;i++)
    {
        if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
            return true;
    }
    return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int a = sc.nextInt();
        int arr1[] = new int[a];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<a;i++)
        {
            arr1[i] = sc.nextInt();
        }
        if(contains123(arr1,a))
            System.out.println("It contains the 1 2 3 sequence");
        else
        System.out.println("It deos not contains the 1 2 3 sequence");
        System.out.println("\nCreated by:- Nishkumar Patel         ID:-21CE102\n");
    }
}
