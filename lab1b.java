package Javaprograms;
import java.util.Scanner;
class Stack
{
	private final int size=5;
	private int[] a=new int[size];
	private int top=-1;
	
	void push(int element )
	{
		if(top==size-1)
			System.out.println("Stack Overflow\n");
		else
		{
			a[++top]=element;
			System.out.println("Element Pushed\n");

		}
	}
	void pop()
	{
		if(top==-1)
			System.out.println("Stack Underflow\n");
		else
			System.out.println("Poped element is = "+a[top--]+" \n ");
	}
	void display()
	{
		if(top==-1)
			System.out.println("Stack is Empty\n");
		else
		{
			System.out.println("Elements of Stacks are:\n");
			for(int i=top;i>=0;i--)
				System.out.println(a[i]+"\n");
			
		}
	}
}
public class lab1b
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		int a=1,choice;
		while(a!=0)
		{
			System.out.println("\nMenu\n"+"1.Push\n"+"2.Pop\n"+"3.Display\n"+"4.Exit\n");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter the item to be pushed");
						int item=sc.nextInt();
						s.push(item);
						break;
				case 2: s.pop();
						break;
				case 3: s.display();
						break;
				case 4: a=0;
						break;
				default: System.out.println("Invalid choice\n");
					
			}
		}
	}
}
