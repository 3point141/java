import java.io.*;

class linear
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int a[]=new int[5];

		System.out.print("enter element to be searched : ");
		int n=Integer.parseInt(x.readLine());

		for(int i=0;i<a.length;i++)
			a[i]=Integer.parseInt(x.readLine());

		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
				System.out.println("element "+n+" found at "+(i+1)+" position ");
		}

		
	}
}