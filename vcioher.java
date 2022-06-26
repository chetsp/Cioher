import java.util.Scanner;
public class vcipher {
    public static void main(String[] args) {
    	Scanner s =new Scanner(System.in);
        System.out.print("enter the message");
		String text = s.next();
		System.out.print("enter the key");
		String key= s.next();
		text=text.toUpperCase();
		key=key.toUpperCase();
        String enc = encrypt(text, key);
        System.out.println(enc);
        System.out.println(decrypt(enc, key));
    }
   static String encrypt(String text, final String key) {
        String res = "";
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
    static String decrypt(String text, final String key) {
        String res = "";
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
}

OUTPUT:
enter the message attackatdawn
enter the keylemon
LXFOPVEFRNHR
ATTACKATDAWN
