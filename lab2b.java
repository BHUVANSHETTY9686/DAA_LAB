package Javaprograms;
import java.util.Scanner;
import java.util.StringTokenizer;
class Customer
{
	private String name,dob;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer name");
		name=sc.next();
		System.out.println("Enter the date of birth as dd/mm/yyyy");
		dob=sc.next();
		
	}
	void display()
	{
		StringTokenizer st=new StringTokenizer(dob,"/");
		System.out.println("Customer details are:");
		System.out.print(name);
		while(st.hasMoreTokens())
		{
			System.out.print(",");
			System.out.print(st.nextToken());
		}
	}
}
public class lab2b 
{

	public static void main(String[] args)
	{
		
		Customer c=new Customer();
		c.read();
		c.display();
		
			
	}
	

}
