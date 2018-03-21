import java.io.*;
class rev
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(x.readLine());
		int rev=0,rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10 + rem;
			n=n/10;
		}

		System.out.println("reverse of the number : " + rev);
	}
}