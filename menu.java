import java.io.*;
class menu
{
	public static void main(String[] args) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the first number : ");
		int a=Integer.parseInt(x.readLine());
		System.out.println("enter the second number : ");
		int b=Integer.parseInt(x.readLine());
		char c=(char)x.read();
		int res=0;
		switch(c)
		{
			case '+': res=a+b;
			System.out.println("sum : "+res);
			break;
			case '-': res=a-b;
			System.out.println("difference : "+res);
			break;
			case '*': res=a*b;
			System.out.println("product : "+res);
			break;
			case '/': 
			if(b==0)
				System.out.println("division not possible ");
			else 
				res=a/b;
			System.out.println("division : "+res);
			break;
			default :
			System.out.println("wrong imput ");
			break;
		}
	}
}