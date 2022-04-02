package Javaprograms;


import java.util.*;
class Dijkstras
{
	int i,j,n,src;
	int a[][]=new int[10][10];
	Scanner sc=new Scanner(System.in);
	void readCostAdjacencyMatrix()
	{
		System.out.println("Enter number of vertices:");
		n=sc.nextInt();
		System.out.println("Enter adjacent matrix:");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Enter the source vertex");
		src=sc.nextInt();
	}
	public int findMinDistance(int d[],int visited[])
	{
		int minDistance=999;
		int minDistanceVertex=-1;
		for(int i=1;i<=n;i++)
			if(visited[i]==0&&d[i]<minDistance)
			{
				minDistance=d[i];
				minDistanceVertex=i;
			}
		return minDistanceVertex;
	}
	public void dijkstra()
	{
		int[] visited=new int[10];
		int[] d=new int[10];
		for(int i=1;i<=n;i++)
		{
			visited[i]=0;
			d[i]=999;
		}
		d[src]=0;
		for(int i=1;i<=n;i++)
		{
			int u=findMinDistance(d,visited);
			visited[u]=1;
			for(int v=1;v<=n;v++)
			{
				if(visited[v]==0 && (d[u]+a[u][v])<d[v])
					d[v]=d[u]+a[u][v];
			}
		}
		for(int i=1;i<=n;i++)
			System.out.println("Distance from source vertex "+src+" to vertex "+i+" is "+d[i]);
		
	}
}
public class Lab7
{
	public static void main(String args[])
	{
		Dijkstras d=new Dijkstras();
		d.readCostAdjacencyMatrix();
		d.dijkstra();
	}
}