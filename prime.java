import java.io.*;
class test
{
	public static void main(String args[]) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int flag=0;
		int n=Integer.parseInt(x.readLine());
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				flag++;
		}
		if(flag==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
		
	}
}