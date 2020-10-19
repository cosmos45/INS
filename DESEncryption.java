import java.util.Scanner;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DESEncryption
{
public static void main(String[] args)
{
try
{
Scanner input = new

Scanner(System.in);
System.out.println("Enter the String:");

String inputString = input.nextLine();

KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
SecretKey myDesKey = keygenerator.generateKey();
Cipher desCipher;

desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
byte[] text=inputString.getBytes();
System.out.println("Text [ByteFormat] : "+ text);
System.out.println("Text : "+new
String(text));

byte[] textEncrypted=desCipher.doFinal(text);

System.out.println("Text Encrypted :" + new String(textEncrypted));
desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
byte[] textDecrypted=desCipher.doFinal(textEncrypted);

System.out.println("Text Decrypted : " + new String(textDecrypted));

}

catch(NoSuchAlgorithmException e){

e.printStackTrace();
}
catch(NoSuchPaddingException e){
e.printStackTrace();
}
catch(InvalidKeyException e){

e.printStackTrace();

}
catch(IllegalBlockSizeException e){
e.printStackTrace();
}
catch(BadPaddingException e){

e.printStackTrace();

}
}
}
