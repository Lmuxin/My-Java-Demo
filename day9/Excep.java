class Demo
{

   int div(int a,int b) throws Exception//在功能上通过关键字throws声明了该功能可能会出现问题
			{
			return  a/b;


			}
}

class E

{

	public static void main(String[] args)
	
	{
	Demo d=new Demo();
	try
	{
	int x=d.div(4,1);
	System.out.println(x);
	}
	catch (Exception e)
	{
		
		
		System.out.println("除0啦");
	}


}

}