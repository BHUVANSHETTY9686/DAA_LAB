package Javaprograms;
import java.util.Scanner;
class Staff
{
	protected int staffid,salary;
	protected String name;
	protected long phone;
	Scanner sc=new Scanner(System.in);
	Staff()
	{
		System.out.println("\nEnter the ID");
		staffid=sc.nextInt();
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter the phone number");
		phone=sc.nextLong();
		System.out.println("Enter the salary");
		salary=sc.nextInt();
		
	}
	void display()
	{
		System.out.print(staffid+"\t"+name+"\t"+phone+"\t"+salary+"\t");
	
	}
	
}
class Teaching extends Staff
{
	 private String domain,publication;
	Teaching()
	{
		super();
		System.out.println("Enter the domain");
		domain=super.sc.next();
		System.out.println("Enter the publication");
		publication=super.sc.next();
		
	}
	void displayTeaching()
	{
		super.display();
		System.out.println(domain+"\t"+publication+"\t");
	}
}
class Technical extends Staff
{
	private String skill;
	Technical()
	{
		super();
		System.out.println("Enter the skill");
		skill=super.sc.next();
	}
	void displayTechnical()
	{
		super.display();
		System.out.println(skill+"\t");
	}
}
class Contract extends Staff
{
	private String period;
	Contract()
	{
		super();
		System.out.println("Enter the period");
		period=super.sc.next();
	}
	void displayContract()
	{
		super.display();
		System.out.println(period+"\t");
	}
}
public class lab2a
{
	public static void main(String[] args)
	{
		int i,n;
		System.out.println("Enter the number of staff(Atleast 3 each)");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Teaching T[]=new Teaching[n];
		Technical TE[]=new Technical[n];
		Contract C[]=new Contract[n];
		System.out.println("\nEnter "+n+" Teaching staff details\n");
		for(i=0;i<n;i++)
		{
			System.out.println("\nTeaching staff "+(i+1)+" details");
			T[i]=new Teaching();
		}
		System.out.println("\nEnter "+n+" Technical staff details");
		for(i=0;i<n;i++)
		{
			System.out.println("Technical staff "+(i+1)+" details");
			TE[i]=new Technical();
		}
		System.out.println("\nEnter "+n+" Contract staff details");
		for(i=0;i<n;i++)
		{
			System.out.println("Contract staff "+(i+1)+" details");
			C[i]=new Contract();
		}
		System.out.println("\n**************Teaching staffs details*************");
		System.out.println("StaffId\tName\tPhone number\tSalary\tDomain\tPublication");
		for(i=0;i<n;i++)
			T[i].displayTeaching();
		System.out.println("\n**************Technical staffs details*************");
		System.out.println("StaffId\tName\tPhone number\tSalary\tSkills");
		for(i=0;i<n;i++)
			TE[i].displayTechnical();
		System.out.println("\n**************Contract staffs details*************");
		System.out.println("StaffId\tName\tPhone number\tSalary\tPeriod");
		for(i=0;i<n;i++)
			C[i].displayContract();
		
	}
}
