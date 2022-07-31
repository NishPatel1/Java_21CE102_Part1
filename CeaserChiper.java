import java.util.*;

public class CeaserChiper {
     // Encrypts text using a shift of s
     public static StringBuffer encrypt(String text, int s)
     {
         StringBuffer result= new StringBuffer();
   
         for (int i=0; i<text.length(); i++)
         {
             if (Character.isUpperCase(text.charAt(i)))
             {
                 char ch = (char)(((int)text.charAt(i) +
                                   s - 65) % 26 + 65);
                 result.append(ch);
             }
             else
             {
                 char ch = (char)(((int)text.charAt(i) +
                                   s - 97) % 26 + 97);
                 result.append(ch);
             }
         }
         return result;
     }
   
     // Driver code
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to encrypt: ");
         String text = sc.nextLine();
         System.out.printf("Enter the shift in the the string: ");
         int s = sc.nextInt();
         System.out.println("Text  : " + text);
         System.out.println("Shift : " + s);
         System.out.println("Cipher: " + encrypt(text, s));
     }
}
