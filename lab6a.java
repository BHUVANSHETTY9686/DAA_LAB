package Javaprograms;

import java.util.Scanner;

class DynamicKnapsack
{
	void knapsack(int m,int n,int w[],int p[])
	{
		int i,j;
		int a[][]=new int[n+1][m+1];
		int x[]=new int [10];
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++)
			{
				if(i==0||j==0)
					a[i][j]=0;
				else if(j<w[i])
					a[i][j]=a[i-1][j];
				else
					a[i][j]=Math.max((a[i-1][j]),(p[i]+a[i-1][j-w[i]]));
				
			}
		}
		System.out.println("Matrix is: ");
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The maximum profit obtained using dynamic approach is "+a[n][m]);
		for(i=0;i<=n;i++)
			x[i]=0;
		i=n;
		j=m;
		while(i>0&&j>0)
		{
			if(a[i][j]!=a[i-1][j])
			{
				x[i]=1;
				j=j-w[i];
			}
			i--;
		}
		System.out.print("The solution vector is"+"\t");
		for(i=0;i<=n;i++)
			System.out.print(x[i]+" ");
		System.out.println("\n\nThe selected items are :");
		{
			for(i=0;i<=n;i++)
			{
				if(x[i]==1)
					System.out.println(i+" ");
			}
		}
	}
}


public class lab6a {

	public static void main(String[] args) 
	{
		int i,j,n,m;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the capacity of knapsack");
		m=sc.nextInt();
		System.out.println("Enter the number of items");
		n=sc.nextInt();
		
		int w[]=new int[n+1];
		int p[]=new int[n+1];
		System.out.println("Enter the weight of each item");
		for(i=1;i<=n;i++)
			w[i]=sc.nextInt();
		System.out.println("Enter the profit of each item");
		for(i=1;i<=n;i++)
			p[i]=sc.nextInt();
		DynamicKnapsack d=new DynamicKnapsack();
		d.knapsack(m, n, w, p);

	}

}
