import java.io.*;
class pattern
{
	public static void main(String[] args) throws IOException{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(x.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print('*');

			}
			System.out.println();
		}
		
	}
}