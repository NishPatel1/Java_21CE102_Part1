import java.util.*;

public class Targetmain {
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
        System.out.println(target);
    }
}
