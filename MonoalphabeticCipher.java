import java.util.Scanner;
public class MonoalphabeticCipher
{

	public static char p[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	public static char ch[] = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',};
	public static String doEncryption(String s)
{

	char c[] = new char[(s.length())];

	for (int i = 0; i < s.length(); i++)
	{
		for (int j = 0; j < 26; j++)
		{
		if (p[j] == s.charAt(i))
		{
			c[i] = ch[j];
			break;
		}
	}
}
return (new String(c));

}
public static String
doDecryption(String s)
{

	char c[] = new
char[(s.length())];
for (int i = 0; i < s.length(); i++)
{
for (int j = 0; j < 26; j++)
{
if (ch[j] == s.charAt(i))
{
c[i] = p[j];
break;
} } }
return (new String(c));
}
public static void main(String args[])
{
String en;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 for encryption or 2 for decryption: " );
int operation=sc.nextInt();
System.out.println("Enter the message: "
);
en = sc.next();
if(operation==1)
{
System.out.println("Encrypted message: "
+ doEncryption(en));
}
else if(operation==2)


{
System.out.println("Decrypted message: " 
+ doDecryption(en));
}
else
{
System.out.println("Invalid input");
}
sc.close(); }}