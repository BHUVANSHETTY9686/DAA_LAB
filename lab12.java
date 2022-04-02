package Javaprograms;
import java.util.*;
class HamiltonianCycle
{
	void computeHamiltoniancycle(int k,int n,int a[][],int x[])
	{
		int i;
		while(true)
		{
			nextValue(k,n,a,x);
			if(x[k]==0)
				return;
			if(k==n)
			{
				System.out.print("Solution = ");
				for(i=1;i<=n;i++)
					System.out.print((x[i])+"-->");
				System.out.println(x[1]+"\n");
			}
			else
				computeHamiltoniancycle(k+1,n,a,x);
		}
	}
	void nextValue(int k,int n,int a[][],int x[])
	{
		int j;
		while(true)
		{
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==0)
				return;
			if(a[x[k-1]][x[k]]==1)
			{
				for(j=1;j<=k-1;j++)
					if(x[j]==x[k])
						break;
				if(j==k)
					if(k<n||(k==n)&&(a[x[n]][1]==1))
						return;
			}
		}
	}
}
public class lab12 
{
	public static void main(String args[])
	{
		int a[][]=new int [20][20];
		int x[]=new int[20];
		int n,i,j;
		HamiltonianCycle h=new HamiltonianCycle();
		System.out.println("Enter the number of vertices the graph");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the adjacency matrix");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				a[i][j]=sc.nextInt();
		x[1]=1;
		for(i=2;i<=n;i++)
			x[i]=0;
		h.computeHamiltoniancycle(2,n,a,x);
	}

}
