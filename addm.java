import java.io.*;

class addm
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int a[][]=new int[3][3];
		int b[][]=new int[3][3];

		System.out.print("\ninput array a :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				a[i][j]=Integer.parseInt(x.readLine());
		}

		System.out.print("\ninput array b :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				b[i][j]=Integer.parseInt(x.readLine());
		}

		System.out.print("\nenter the choice +/-");
		char ch=(char)x.read();

		switch(ch)
		{
			case '+':
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(" "+(a[i][j]+b[i][j]));
				}
			System.out.println();
			}
			break;
			case '-':
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(" "+(a[i][j]-b[i][j]));
				}
			System.out.println();
			}
			break;

			default:
			System.out.print("worng input");

		}

		
	}
}