import java.io.*;

class lar
{
	public static void main(String[] args) throws IOException
	{
		int a[]= new int[5];
		BufferedReader x =new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<a.length;i++)
			a[i]=Integer.parseInt(x.readLine());

		int max=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		
		System.out.println("Largest number in the array : "+max);
	}
}