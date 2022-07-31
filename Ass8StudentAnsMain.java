/*
 * Created by:- Nishkumar Patel
 * ID:- 21CE102
 * Aim:- The problem is to write a program that will grade multiple-choice tests. Assume 
 * there are eight students and ten questions, and the answers are stored in a two dimensional array. Each row records a student’s answers to the questions, as 
 * shown in the following array.
 * Students’ Answers to the Questions:
 * 0 1 2 3 4 5 6 7 8 9
 *                                                 Student 0 A B A C C D E E A D
 *                                                 Student 1 D B A B C A E E A D
 *                                                 Student 2 E D D A C B E E A D
 *                                                 Student 3 C B A E D C E E A D
 *                                                 Student 4 A B D C C D E E A D
 *                                                 Student 5 B B E C C D E E A D
 *                                                 Student 6 B B A C C D E E A D
 *                                                 Student 7 E B E C C D E E A D
 * The key is stored in a one-dimensional array:
 * Key to the Questions:
 * 0 1 2 3 4 5 6 7 8 9
 * Key D B D C C D A E A D
 * Your program grades the test and displays the result. It compares each student’s 
 * answers with the key, counts the number of correct answers, and displays it.
 */

import java.util.*;

public class Ass8StudentAnsMain {
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
