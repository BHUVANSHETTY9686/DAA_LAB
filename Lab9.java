package Javaprograms;
import java.util.Scanner;
class prim
{
		void readWeightMatrix()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of vertices");
			int n=sc.nextInt();
			int a[][]=new int[n+1][n+1];
			System.out.println("Enter the weight matrix of a graph");
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					a[i][j]=sc.nextInt();
			findMinSpanningTree(n,a);
		}
		void findMinSpanningTree(int n,int a[][])
		{
			int count=1,cost=0,k=1,i,j,u=0,v=0;
			int visited[]=new int[n+1];
			int t[][]=new int[n+1][4];
			visited[1]=1;
			while(count!=n)
			{
				int min=999;
				for(i=1;i<=n;i++)
					for(j=1;j<=n;j++)
					{
						 if(visited[i]==1 && visited[j]==0 && min>a[i][j])
						 {
							  u=i;
							  v=j;
							  min=a[i][j];
						 }
							   
					}
					if(min==999)
						break;
					t[k][1]=u;
					t[k][2]=v;
					t[k][3]=min;
					cost+=min;
					visited[v]=1;
					k++;
					count++;
			}
			if(count==n)
			{
				System.out.println("minimum cost spanning tree is");
				System.out.println("edge"+"     " +"weight");
				for(i=1;i<=k-1;i++)
					System.out.println(t[i][1]+"-->"+t[i][2]+"   "+t[i][3]);
				System.out.println("cost of minimumspanning tree is"+" "+cost);
			}
			else
			{
				System.out.println("minimum spanning tree of a graph does not exist");
			}
		}
}

public class Lab9 
{

	public static void main(String[] args)
	{
		prim p=new prim();
		p.readWeightMatrix();
	}

}
