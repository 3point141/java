import java.io.*;
import java.util.*;
class method
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();

		method m=new method();
		m.area((float)a,(float)b);
		//m.area(a,b);

		
	}

	public void area(int a,int b)
	{
		System.out.println("area : " +(a*b));
	}

	public void area (float a,float b)
	{
		System.out.println("sum : "+(a*b));
	}
}