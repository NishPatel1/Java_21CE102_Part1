import java.util.*;

public class Firstmain {

public static String StartOz(String s)
{
    String s2 = s.substring(0, 2);
    System.out.println(s2);
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
    }
}
