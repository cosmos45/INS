import java.util.Scanner;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;
public class Sample {
public static void main(String [] args) throws Exception {
// generate public and private keys
KeyPair keyPair = buildKeyPair();
PublicKey pubKey = keyPair.getPublic();
PrivateKey privateKey = keyPair.getPrivate();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the plain text:");
String plaintext = sc.next();
// encrypt the message
byte [] encrypted = encrypt(privateKey, plaintext);
System.out.println(new String(encrypted)); // <<encrypted message>>
// decrypt the message
byte[] secret = decrypt(pubKey, encrypted);
System.out.println(new String(secret)); // This is a secret message
}
public static KeyPair buildKeyPair() throws NoSuchAlgorithmException {
final int keySize = 2048;
KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
keyPairGenerator.initialize(keySize);
return keyPairGenerator.genKeyPair();
}
public static byte[] encrypt(PrivateKey privateKey, String message) throws Exception {
Cipher cipher = Cipher.getInstance("RSA");
cipher.init(Cipher.ENCRYPT_MODE, privateKey);
return cipher.doFinal(message.getBytes());
}
public static byte[] decrypt(PublicKey publicKey, byte [] encrypted) throws Exception {
Cipher cipher = Cipher.getInstance("RSA");

cipher.init(Cipher.DECRYPT_MODE, publicKey);
return cipher.doFinal(encrypted);
}
}
