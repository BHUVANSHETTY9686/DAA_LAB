package Javaprograms;
import java.util.Scanner;
class Knapsack
{
	void greedyKnapsack(float weight[],float profit[],int n,float capacity)
	{
		float p=0;
		int i;
		float x[]=new float[n];
		float u; //bag remaining capacity
		for(i=0;i<n;i++)
			x[i]=0;
		u=capacity;
		for(i=0;i<n;i++)
		{
			if(weight[i]>u)
				break;
			x[i]=1;
			u-=weight[i];
		}
		if(i<n)
			x[i]=(float)u/weight[i];
		System.out.println("Solution vector is:");
		for(i=0;i<n;i++)
			System.out.println(" "+x[i]);
		for(i=0;i<n;i++)
			p+=(profit[i]*x[i]);
		System.out.println("Maximum profit is: "+p);
		
		
	}
}
public class lab6b 
{
	public static void main(String args[])
	{
		int i,n,j;
		float capacity,u;
		System.out.println("Enter the number of items");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		float profit[]=new float[n];
		float weight[]=new float[n];
		float ratio[]=new float[n];
		System.out.println("Enter the profit of each item");
		for(i=0;i<n;i++)
			profit[i]=sc.nextFloat();
		System.out.println("Enter the weight of each item");
		for(i=0;i<n;i++)
			weight[i]=sc.nextFloat();
		System.out.println("Enter the capacity of knapscak");
		capacity=sc.nextFloat();
		for(i=0;i<n;i++)
			ratio[i]=profit[i]/weight[i];
		for(i=0;i<n;i++)
			for(j=0;j<n-i-1;j++)
				if(ratio[j]<=ratio[j+1])
				{
					float temp=ratio[j+1];
					ratio[j+1]=ratio[j];
					ratio[j]=temp;
					float temp1=profit[j+1];
					profit[j+1]=profit[j];
					profit[j]=temp1;
					float temp2=weight[j+1];
					weight[j+1]=weight[j];
					weight[j]=temp2;
					
				}
		System.out.println("The items after arranging in decreasing order of their ratios");
		System.out.println("\nItem\tWeights\tProfit\tRatios");
		for(i=0;i<n;i++)
			System.out.println("\nx["+i+"]\t"+weight[i]+"\t"+profit[i]+"\t"+ratio[i]);
		Knapsack k=new Knapsack();
		k.greedyKnapsack(weight,profit,n,capacity);
	}
	

}
