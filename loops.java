/* q->integer test cases
a-> integer 
b-> integer
n-> integer

(a+2^0 . b),(a+2^0 . b +2^1 . b), ... , (a+2^0 . b + 2^1 . b + ... + 2^(n-1) . b)

hackerRank JAVA_lOOPS_II problem 
*/

import java.io.*;
import static java.lang.Math.pow;
class loops
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		int q=Integer.parseInt(x.readLine());
		
		while(q>0)
		{
			int a=Integer.parseInt(x.readLine());
			int b=Integer.parseInt(x.readLine());
			int n=Integer.parseInt(x.readLine());

			double sum=a+b;
			System.out.print(a+b);
			for(int i=1;i<n;i++)
			{
				sum=sum+(pow(2,i)*b);
				System.out.print(" "+(int)sum);
			}
			System.out.println();
			q--;

		}

		
	}
}