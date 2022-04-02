package Javaprograms;

import java.util.Random;
import java.util.Scanner;
class First extends Thread
{
	int n;
	First(int n)
	{
		this.n=n;
	}
	public void run()
	{
		int i,num;
		Random r=new Random();
		try
		{
			for(i=0;i<n;i++)
			{
				num=r.nextInt(100);
				System.out.println("\nFirst Thread :"+num);
				Thread.sleep(1000);
				Thread t2=new Thread(new Second(num));
				t2.start();
				Thread.sleep(1000);
				Thread t3=new Thread(new Third(num));
				t3.start();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured: "+e);
		}
	}
}
class Second extends Thread
{
	int n;
	Second(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("Second Thread:- Square of the number is: "+(n*n));
	}
}
class Third extends Thread
{
	int n;
	Third(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("Third Thread:- Cube of the number is: "+(n*n*n));
	}
}
public class lab3b
{
	public static void main(String args[])
	{
		int n;
		System.out.println("How many random numbers ?");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		First t1=new First(n);
		t1.start();
		
	}
}
