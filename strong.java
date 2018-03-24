import java.io.*;

class strong
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(x.readLine());
		int num=n,rem=0,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}


		if(sum==num)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
		
	}

	public static int fact(int t) 
	{
		int z=1;
		for(int i=1;i<=t;i++)
			z=z*i;
		return z;
		
	}
}