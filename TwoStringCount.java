import java.util.*;

public class TwoStringCount {

    public static int GetCount(String amod, String bas)
    {
        int count = 0;
        int len = amod.length();
        String[] a = new String[len-1];
        for(int i=0;i<len-1;i++)
        {
            a[i]=amod.substring(i, i+2);
        }
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len-1;j++)
            {
                if(a[i].equals(a[j]))
                {
                    int f=j;
                    while(f<len-2)
                    {
                        a[f]=a[f+1];
                        f++;
                    }
                    a[f]=null;
                    len--;
                    j--;
                }
            }
        }
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<bas.length()-1;j++)
            {
                if(a[i].equals(bas.substring(j,j+2)))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        if(s1.length()>s2.length())
        {
            System.out.println("Number of 2 char string repeation is " + GetCount(s2, s1));
        }
        else if(s2.length()>s1.length())
        {
            System.out.println("Number of 2 char string repeattion is " + GetCount(s1, s2));
        }
        else
        {
            System.out.println("Number of 2 char string repeattion is " + GetCount(s1, s2));
        }
    }
}
