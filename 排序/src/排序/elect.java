package ≈≈–Ú;

public class elect {
	public static void electsort(int [] arr)
	{
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			int temp;
			if(arr[i]>arr[j])
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}
	}
	}
	
	public static void main(String[] args) {
		int [] a={3,1,5,2,0,9};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		electsort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		// TODO Auto-generated method stub

	}

}
