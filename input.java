import java.io.*;
class input
{
public static void main(String args[])throws IOException
{
BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("Enter n");
int n= Integer.parseInt(x.readLine());
System.out.print("The number you have entered is: ");
System.out.println(n);
}
}