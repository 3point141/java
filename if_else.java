import java.io.*;
class if_else
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(x.readLine());
		if(n%2==0)
			System.out.println("even number ");
		else
			System.out.println("odd number ");


		int t=Integer.parseInt(x.readLine());
		if(t>100)
			System.out.println("number greater than 100 ");
		else if (t>=50 && t<=100)
			System.out.println("number lies between 50 and 100 ");
		else 
			System.out.println("number is smaller than 50");

	}
}