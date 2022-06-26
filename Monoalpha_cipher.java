import java.util.Scanner;
public class Monoalpha {      
    public static void main(String[] args) {                   
    char p[]= { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] ch={'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A','S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C' , 'V', 'B','N', 'M' };
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the message");
        String input=sc.next();
        char c[] =new char[input.length()];
        System.out.println("encryption");
        for(int i=0;i<input.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(p[j]==input.charAt(i))
                {
                    c[i]= ch[j];
                    break;
                }
        	}
        System.out.println(" "+input.charAt(i)+ "  " + c[i]);
        }
        System.out.println();
        System.out.println("decryption");
      char p1[] = new char[(input.length())];
       System.out.println("Plain Text : " );
         for (int i = 0; i < c.length; i++) 
        {
            for (int j = 0; j < 26; j++) 
               {
            if (ch[j] == c[i]) 
            {
                p1[i] = p[j];
                break;
            }
              }
        System.out.print( p1[i]);
      }
         }
}


OUTPUT:
enter the message
chetana
encryption
 c  E
 h  I
 e  T
 t  Z
 a  Q
 n  F
 a  Q

decryption
Plain Text : 
chetana
