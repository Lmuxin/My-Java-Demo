

public class mynum {
	
	
	public static void main(String args[]) {
		
		
		int mynum[]= {1,0,3,0,5,0,6,-1,-3,0,7,};
		for(int i=0;i<mynum.length;i++)
		System.out.print(mynum[i]+" ");
		System.out.println(" ");
		zeroend(mynum);
		for(int i=0;i<mynum.length;i++)
		System.out.print(mynum[i]+" ");
		
	}
	
	
	public static void  zeroend(int []a) {
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			
			if(a[j]==0)
			{
				j--;
			
		     	continue;
		    }
		
		if(a[i]==0)
			{
				a[i]=a[j];
				a[j]=0;
				j--;
			}
		i++;
	 }
	}

}
