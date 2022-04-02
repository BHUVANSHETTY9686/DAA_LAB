package Javaprograms;
import java.util.Scanner;
import java.util.Random;
class mergesort
{
    void msort(int a[],int l,int h)
	{
    	if(l<h)
    	{
    	 int mid=(l+h)/2;
    	 msort(a,l,mid);
    	 msort(a,mid+1,h);
    	 merge(a,l,mid,h);
        }
	}
   void merge(int a[],int l,int mid,int h)
   {
	   int i=l;
	   int j=mid+1;
	   int k=l;
	   int m;
	   int b[]=new int[4000];
	   while((i<=mid) &&(j<=h))
	   { 
		   if(a[i]<=a[j])
		   {
			   b[k]=a[i];
			   i++;
		   }
		   else
		   {
			   b[k]=a[j];
			   j++;
		   }
		   k++;
	  }
	  if(i>mid)
	  {
		   m=j;
		   while(m<=h)
		   {
			   b[k]=a[m];
			   m++;
			   k++;
		   }
	  }
	  else
	  {
		   m=i;
		   while(m<=mid)
		   {
			   b[k]=a[m];
			   m++;
			   k++;
		   }
	  }
	  for(i=l;i<=h;i++)
	  {
		  a[i]=b[i];
	  }
   }
   
}
public class lab5 {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		n=sc.nextInt();
		int a[]=new int[n];
		Random r=new Random();
		for(i=0;i<n;i++)
	        a[i]=r.nextInt(123);
		mergesort m=new mergesort();
		System.out.println("Array before sorting:");
		for(i=0;i<n;i++)
			 System.out.print(a[i]+"\t");
		long start=System.nanoTime();
		m.msort(a,0,n-1);
		long end=System.nanoTime();
		System.out.println("\nArray after sorting:");
		for(i=0;i<n;i++)
			 System.out.print(a[i]+"\t");
		System.out.println("\nThe time taken by merge sort is"+" "+(end-start)+"ns");
	}

}
