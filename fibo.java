import java.io.*;

class fibo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int a=0;
		int b=1;
		int next=1;

		int n=Integer.parseInt(x.readLine());
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++)
		{
			next=a+b;
			a=b;
			b=next;
			System.out.print(next+" ");

		}

	}
}