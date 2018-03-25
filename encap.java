import java.io.*;
import java.util.*;

class student
{
	int age;
	String name;

	public student()
	{
		age=0;
		name="aaa";
	}

	public student(int a ,String b)
	{
		age=a;
		name=b;
	}
}

class encap
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter age : ");
		int age=Integer.parseInt(x.readLine());
		System.out.println("\n enter name : ");
		String name=x.readLine();

		System.out.println("default constructer : ");
		student s=new student();
		System.out.println("age : "+s.age+" name : "+s.name);
		student s1=new student(age,name);
		System.out.println("parameterised constructer : ");
		System.out.println("age : "+s1.age+" name : "+s1.name);

	}
}