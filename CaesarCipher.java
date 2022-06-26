
import java.util.Scanner; 
public class CaesarCipher
{
    public static final String alphabet = “abcdefghijklmnopqrstuvwxyz";
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int p = alphabet.indexOf(plainText.charAt(i));// p is the position of the alphabet as per string alphabet    
            int key = (shiftKey + p) % 26;// new key 
            char replace = alphabet.charAt(key);//alphabet according to new key 
            cipherText += replace;
        }
        return cipherText;
    }
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int p = alphabet.indexOf(cipherText.charAt(i));
            int key = (p - shiftKey) % 26;
            if (key < 0)
            {
                key = alphabet.length() + key;
            }
            char replaceVal = alphabet.charAt(key);
            plainText += replaceVal;
        }
        return plainText;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        System.out.print("Enter the choice \n1.Encrypt-Decrypt \n2.brute force");
        int c=sc.nextInt();
        switch(c)
        {
        case 1 : System.out.print("enter the key");
                 int key=sc.nextInt();
        	      System.out.println("encrypted String");
                 String encrypt= encrypt(message,key);
                 System.out.println(encrypt);
                 System.out.println("decrypted String");
                 System.out.println(decrypt(encrypt, key));
                 break;
        case 2 : 
        	       System.out.println("Cryptanalysis ");
                   for(int i=1;i<26;i++)
        	         {
        	             System.out.println("key "+i+" "+ decrypt(message,i));
                     }
                   break;   
         default:System.out.print("default");   
                 break; 
        }
        sc.close();
    }
}

OUTPUT:
Enter the String for Encryption: 
cryptography
Enter the choice 
1.Encrypt-Decrypt 
2.brute force1
enter the key3
encrypted String
fubswrjudskb
decrypted String
cryptography

Enter the String for Encryption: 
ovdthufwvzzpislrlfzhylaolyl
Enter the choice 
1.Encrypt-Decrypt 
2.brute force2
Cryptanalysis 
key 1 nucsgtevuyyohrkqkeygxkznkxk
key 2 mtbrfsdutxxngqjpjdxfwjymjwj
key 3 lsaqerctswwmfpioicwevixlivi
key 4 krzpdqbsrvvleohnhbvduhwkhuh
key 5 jqyocparquukdngmgauctgvjgtg
key 6 ipxnbozqpttjcmflfztbsfuifsf
key 7 howmanypossiblekeysarethere
key 8 gnvlzmxonrrhakdjdxrzqdsgdqd
key 9 fmukylwnmqqgzjcicwqypcrfcpc
key 10 eltjxkvmlppfyibhbvpxobqebob
key 11 dksiwjulkooexhagauownapdana
key 12 cjrhvitkjnndwgzfztnvmzoczmz
key 13 biqguhsjimmcvfyeysmulynbyly
key 14 ahpftgrihllbuexdxrltkxmaxkx
key 15 zgoesfqhgkkatdwcwqksjwlzwjw
key 16 yfndrepgfjjzscvbvpjrivkyviv
key 17 xemcqdofeiiyrbuauoiqhujxuhu
key 18 wdlbpcnedhhxqatztnhpgtiwtgt
key 19 vckaobmdcggwpzsysmgofshvsfs
key 20 ubjznalcbffvoyrxrlfnergurer
key 21 taiymzkbaeeunxqwqkemdqftqdq
key 22 szhxlyjazddtmwpvpjdlcpespcp
key 23 rygwkxizyccslvouoickbodrobo
key 24 qxfvjwhyxbbrkuntnhbjancqnan
key 25 pweuivgxwaaqjtmsmgaizmbpmzm
