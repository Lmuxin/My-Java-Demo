package ≤È’“;

public class Serch {
	/*public static int search(int k,int[] a)
	{
		int ret=-1;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]==k)
		{
			ret=i;
			break;
		}
	}
return ret;
	}*/
	/*public static int search (int k,int []a)
	{ 
		int ret=-1;
		int l=0;
	int r=a.length;
	while(l!=r)
	{
		int m=(l+r)/2;
		
		if(a[m]==k)
		{
			ret=m;
			break;
		}
		else if(a[m]>k)
		{
			r=m-1;
		}
		else 
			l=m+1;
	}
		if(a[l]==k)
			ret=l;
		return ret;
	}	
		*/
	public static void sort (int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int idex=0;
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]>a[idex])
					idex=j;
			}
			
		
		int t=a[idex];
		a[idex]=a[a.length-i-1];
		a[a.length-i-1]=t;
	}
		
	}
	public static void main(String[] args)
	
	{
		
		int[] b={9,5,8,3,4,2,1};
		sort(b);
		for(int k:b)
		{
			System.out.println(k);
		}
			
	}
}
