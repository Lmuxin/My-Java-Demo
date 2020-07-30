class  Array {

public static void main(String[] args){

int[][] a={{1,2,3,4},{1,5,6,7},{2,3,4,5}};
int sum=0;
for(int x =0;x<a.length;x++)
{
	for(int y=0;y<a[x].length;y++)
		
		{
			sum=sum+a[x][y];
			System.out.println(sum);
			
		}
		//System.out.println(sum);
}
	//System.out.println(sum);

}

}