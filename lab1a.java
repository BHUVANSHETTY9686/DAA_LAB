package Javaprograms;

import java.util.Scanner;

class Student
{
	private String name,usn,branch;
	private long phoneno;
	Student(String name,String usn,String branch,long phoneno)
	{
		this.name=name;
		this.usn=usn;
		this.branch=branch;
		this.phoneno=phoneno;
	}
	void display()
	{
		System.out.println(name+"\t"+usn+"\t"+branch+"\t"+phoneno);
	}
}
public class lab1a
{

	public static void main(String[] args)
	{
		long r;
		String n,u,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Students");
		 int no=sc.nextInt();
		 sc.nextLine();
		Student[] s=new Student[no];
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Student "+(i+1) +" details");
			System.out.println("Enter the Name:");
			n=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the USN:");
			u=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the Branch:");
			b=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the Phone number");
			r=sc.nextLong();
			s[i]=new Student(n,u,b,r);
			
		}
		System.out.println("Student Details are:\n"+"Name\tUSN\t\tBranch\tPhoneno\t");
		for(int i=0;i<no;i++)
		{
			s[i].display();
		}
		
	}

}
