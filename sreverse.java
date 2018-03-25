import java.io.*;
class sreverse
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter your string : ");
		String s1=x.readLine();
		String s2="";
		char xx;
		for(int i=(s1.length()-1);i>=0;i--)
		{
			xx=s1.charAt(i);
			s2=s2+xx;
		}

		System.out.println("\n reversed string : " + s2);

		if(s2.compareTo(s1)==0)
			System.out.println("palindrome string");
		else
			System.out.println("Not Palindrome ");



	}
}