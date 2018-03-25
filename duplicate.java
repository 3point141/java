import java.io.*;
class duplicate
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int a[] = new int[5];

		for(int i=0;i<a.length;i++)
			a[i]=Integer.parseInt(x.readLine());

		int check=0,flag=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]>0)
				{
					a[j]=-1;
					flag=1;
				}

			}
			if(flag==1)
				{
					a[i]=-1;
					flag=0;
				}
		
		}

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				System.out.print(a[i]+" ");
		}
		
	}
}