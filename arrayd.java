import java.io.*;

class arrayd
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));

		int a[]=new int[5];
		int b[]=new int[5];

		//declaration types

		a[0]=1;
		for(int i=1;i<a.length;i++)
			a[i]=i+1;

		// cloning
		for(int i=0;i<b.length;i++)
			b[i]=a[i];
		
		//results
		System.out.print("array a : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);

		System.out.print("\narray b : ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]);
	}
}