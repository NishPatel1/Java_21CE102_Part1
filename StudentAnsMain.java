/*
**  Created By:- Nish Patel
**  ID:- 21CE102
**
*/

import java.util.Scanner;

public class StudentAnsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] stu = new char[8][11];
        for(int i=0;i<8;i++)
        {
            System.out.print("Enter the answers of Student "+i+": ");
            stu[i][0] = (char)i;
            for(int j=1;j<11;j++)
            {
                char a = sc.next().charAt(0);
                stu[i][j] = a;
            }
        }
        char key[] = {'D','B','D','C','C','D','A','E','A','D'};
        int ans[][] = new int[8][2];
        int c=0;
        for(int i=0;i<8;i++)
        {
            ans[i][0] = stu[i][0];
            for(int j=1;j<11;j++)
            {
                if(stu[i][j]==key[j-1])
                {
                    c++;
                }

            }
            ans[i][1]=c;
            c=0;
        }
        System.out.println();
        for(int i=0;i<8;i++)
        {
            System.out.println("Number of correct answers by Student "+ans[i][0]+" is "+ans[i][1]);
        }
        System.out.println("\nCreated by:- Nishkumar Patel         ID:-21CE102\n");
    }
}
