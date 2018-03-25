import java.io.*;

class gcdn
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int a=Integer.parseInt(x.readLine());
		int b=Integer.parseInt(x.readLine());
		int big=b;
		int flag=0;
		if(a==0 || b==0)
		{
			System.out.println("0");
			flag=1;
		}
		if(a==b)
		{
			System.out.println(a);
			flag=1;
		}
		
		if(a>b)
		{
			big=a;
		}
		
		int res=0;
		if(flag==0)
		{
		for(int i=2;i<big;i++)
		{
			if(a%i==0 && b%i==0)
				res=i;
		}

		System.out.print(res);
		}
	}
}