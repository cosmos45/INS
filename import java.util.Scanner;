import java.util.Scanner;

public class CaesarCipher2
{
public static void main(String[] args)
{
System.out.println("Enter 1 for encryption or 2 for decryption:");
Scanner input=new Scanner(System.in);
int operation=input.nextInt();
System.out.println("Enter the key value in integer:");
int key=input.nextInt();
input.nextLine();
System.out.println("Enter the string:");
String inputString=input.nextLine();
if(operation==1){
System.out.println(encrypt(key,inputString));
}else if(operation==2){
System.out.println(decrypt(key, inputString));
}else{
System.out.println("Invalid input!!");
}
}

public static String encrypt(int key, String input){

StringBuilder sb=new StringBuilder();
int charCode=0;
for(int i=0;i<input.length();i++){
charCode=input.charAt(i)+key;
sb=sb.append(Character.toString((char)charCode));
charCode=0;
}
return sb.toString();
}

public static String decrypt(int key, String input){
StringBuilder sb=new StringBuilder();
int charCode=0;
for(int i=0;i<input.length();i++){
charCode=input.charAt(i)-key;
sb=sb.append(Character.toString((char)charCode));
charCode=0;
}
return sb.toString();
}

}