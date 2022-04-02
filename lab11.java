package Javaprograms;
import java.util. *;
public class lab11
{
	static int c=0;
	public  static void main(String[] args) 
	{
		int i,j,n,sum=0,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int x[]=new int[n];
		int a[]=new int[n];
		System.out.println("enter the elements of set in ascending order");
		for(i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
			 sum=sum+a[i];
			 x[i]=0;
		}
		System.out.println("Enter the d value");
		d=sc.nextInt();
		if(sum<d||a[0]>d)
		{
			System.out.println("No solution");
		}
		else
		{
			findsubset(0,0,sum,x,a,d);
			if(c==0)
				System.out.println("No solution");
		}
	}
	static void findsubset(int cs,int k,int sum,int []x,int []a,int d)
	{
		x[k]=1;
		if(cs+a[k]==d)
		{
			 c++;
			 System.out.print("solution"+" "+c+" "+"is {");
			   for(int i=0;i<=k;i++)
				   
			   {
				   		if(x[i]==1) {
				   			System.out.print(a[i]+" ");
				   		}
			   }
			   System.out.println("}");
		}
		else if((cs+a[k]+a[k+1])<=d)
		
			findsubset(cs+a[k],k+1,sum-a[k],x,a,d);
		if((cs+sum-a[k])>=d && (cs+a[k+1])<=d)
		{
				x[k]=0;
				findsubset(cs,k+1,sum-a[k],x,a,d);
		}
		
		
	}

}
