import java.io.*;

class arm
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(x.readLine());
		int num=n,sum=0,rem=0;

		while(n>0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}

		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number ");


		
	}
}