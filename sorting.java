import java.io.*;

class sorting
{
	public static void main(String[] args)  throws IOException
	{
		int a[] = new int[5];
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("input unsorted array : ");
		for(int i=0;i<a.length;i++)
			a[i]=Integer.parseInt(x.readLine());

		int temp=0;

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j+1]<a[j])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}

			}
		}

		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);		
	}
}