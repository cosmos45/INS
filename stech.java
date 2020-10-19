import java.io.*;
class stech
{
public static void main(String[]
args)throws Exception
{
BufferedReader br = new

BufferedReader(new
InputStreamReader(System.in));
System.out.println("Enteryour plain text: ");

String accept = br.readLine();
System.out.println("Enter the number of rows: ");
int r =
Integer.parseInt(br.readLine());

System.out.println("Enter the number of columns: ");
int c =
Integer.parseInt(br.readLine());
int count = 0;
char cont[][] = new

char[r][c];

for(int i = 0; i < r; i++)
{
for(int j = 0; j < c;

j++)

{

if(count >= accept.length())

{
cont[i][j] = ' ';
count++;

}
else
{
cont[i][j] = accept.charAt(count);
count++;

}
}
}
System.out.println("\n Enter the order of columns you want to view them in: ");

int choice[] = new int[c];
for(int k = 0; k < c; k++)
{
System.out.println("Choice" +k+ "-->");

choice[k] =
Integer.parseInt(br.readLine());

}
System.out.println("\n Cipher text in matrix is -->");

String cipher = "";

for(int j = 0; j < c; j++)
{
int k = choice[j];
for(int i = 0; i < r;

i++)

{
cipher +=

cont[i][k];

}
}
cipher = cipher.trim();
System.out.println(cipher);
}
}