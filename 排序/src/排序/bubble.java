package ≈≈–Ú;

public class bubble {
	public static void bubblesort(int [] arr)
	{
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			int temp;
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	}
public static void main (String []args)
{
	int []a={9,5,2,0,8,6};
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}
	System.out.println();
	bubblesort(a);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}

}
}