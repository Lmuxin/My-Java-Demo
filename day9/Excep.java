class Demo
{

   int div(int a,int b) throws Exception//�ڹ�����ͨ���ؼ���throws�����˸ù��ܿ��ܻ��������
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
		
		
		System.out.println("��0��");
	}


}

}