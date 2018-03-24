import java.io.*;

class palin
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(x.readLine());
		int num=n;
		int rem=0,rev=0;

		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}

		if(rev==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
}