package Javaprograms;
import java.util.*;

public class lab3a
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number(numerator)");
		int a=sc.nextInt();
		System.out.println("Enter Second number(Denominator)");
		int b=sc.nextInt();
		try
		{
			int result=a/b;		
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator can not be zero (Exception handled) "+e);
		}
	}
}
