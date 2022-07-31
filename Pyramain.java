/*
**  Created By:- Nishkumar Patel
**  ID:- 21CE102
**
*/

public class Pyramain {
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
    }
}
