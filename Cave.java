import java.util.*;
import java.math.*;

class Cave
{
  public static String alphabets = "abcdefghijklmnopqrstuvwxyz";
   public static String Encryption(String a,int k,int k1)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                sb.append(' ');
            }
            else
            {
                if(i%2==0)
            {
            int position = alphabets.indexOf(a.charAt(i));
            int encryptionposition = (position + (k+k1-1)) % 26;
            sb.append(alphabets.charAt(encryptionposition));
            }
            else
            {
                int position = alphabets.indexOf(a.charAt(i));
                int encryptionposition = (position + (k+k1+1)) % 26;
                sb.append(alphabets.charAt(encryptionposition));
            }
        }
    }
     return sb.toString();
         
    }
    
    public static String Dencyption(String b,int k,int k1)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)==' ')
            {
                sb.append(' ');
            }
            else
            {
                if(i%2==0)
                {
                int dposition = alphabets.indexOf(b.charAt(i));
                int decryptionposition = (dposition - (k+k1-1) ) % 26;
                if(decryptionposition<0)
                {
                    decryptionposition = alphabets.length() + decryptionposition; 
                }
                sb.append(alphabets.charAt(decryptionposition));
                }
                else
                {
                  int dposition = alphabets.indexOf(b.charAt(i));
                int decryptionposition = (dposition - (k+k1+1) ) % 26;
                if(decryptionposition<0)
                {
                    decryptionposition = alphabets.length() + decryptionposition; 
                } 
                sb.append(alphabets.charAt(decryptionposition));
                }
            }
        }
         return sb.toString();
        
         
    }

    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       System.out.println("what do you want to perform -  encryption or decryption: ");
       String todo = input.nextLine();
        if(todo.equals("encryption"))
        {
             System.out.print("Enter plain text: ");
             String plaintext = input.nextLine();
             System.out.println("Enter the key1: ");
             int key = input.nextInt();
             System.out.println("Enter the key2: ");
             int key1 = input.nextInt();
             System.out.println(Encryption(plaintext,key,key1));
        }
        if(todo.equals("decryption"))
        {
            System.out.println("Enter cipher text: ");
            String decrpty = input.nextLine();
            System.out.println("Enter the key1: ");
            int key = input.nextInt();
            System.out.println("Enter the key2: ");
            int key1 = input.nextInt();
            System.out.println(Dencyption(decrpty,key,key1));
        }
    }
}
