package Javaprograms;
import java.util.Random;
import java.util.Scanner;
class QuickSort
{
	public void qSort(int a[],int low,int high)
	{
		int j;
		if(low<high)
		{
			j=partition(a,low,high+1);
			qSort(a,low,j-1);
			qSort(a,j+1,high);
		}
	}
	public int partition(int a[],int l,int h)
	{
		int pivot=a[l];
		int i=l;
		int j=h;
		do 
		{
			do
			{
				i++;
			}while(a[i]<pivot);
			do
			{
				j--;
			}while(a[j]>pivot);
			if(i<j)
				interchange(a,i,j);
			
			
		}while(i<=j);
		interchange(a,l,j);
		return j;
	}
	public void interchange(int a[],int i,int j)
	{
		int t;
		t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
}
public class lab4
{
	public static void main(String args[])
	{
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		n=input.nextInt();
		int a[]=new int[n+1];
		Random r=new Random();
		for(i=0;i<n;i++)
			a[i]=r.nextInt(500);
		a[i]=999;
		QuickSort qSort=new QuickSort();
		System.out.println("Before Sorting: ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+ "\t");
		int low=0;
		int high=n-1;
		long start=System.nanoTime();
		qSort.qSort(a, low, high);
		long end=System.nanoTime();
		System.out.println("\n\nAfter Sorting: ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\n\nThe time taken by Quick sort is "+(end-start)+"ns");
	}
}
