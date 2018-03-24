import java.io.*;

class fact
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(x.readLine());
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;

		System.out.println("Factorial : "+fact);
	}
}