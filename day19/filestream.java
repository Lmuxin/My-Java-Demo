   /*��Ҫ����ͼƬ����,��Ҫ�õ��ֽ���
   
   �ֽ���  InputStream(��)  OutputStream(д)
   */
     import java.io.*;
     class  Filestream
     {
     
     public static void main(String[] args)throws IOException
     {
     
       writeFile();
     
     }
	 
	 public static void readFile_3()throws IOException//��ȡ���������� ���˴����� �����
        {
			
        FileInputStream fis=new FileInputStream("fos.txt");
        
		int num=fis.available();//���Եó��ı����ж��ٸ��ַ� , \r    \n�ֱ���һ���ַ�
		
		byte[] buf=new Byte[fis.available()];//����һ���ոպõ� ����
		
		 fis.read(buf);
		
	     System.out.println(new String(buf));

          fis.close();
        }
		
	
	 public static void readFile_2()throws IOException//��ȡ��һ������ ���˴����� �����
        {
			
        FileInputStream fis=new FileInputStream("fos.txt");
   
		byte[] buf=new byte[1024];
        int len=0;
		while((len=fis.read(buf))!=-1)
		{
			System.out.println(new String (buf,0,len));
	
		}
        fis.close();
     
        }
		

        public static void readFile_1()throws IOException//��ȡ�ڶ�������  һ��һ����
        {
			
        FileInputStream fis=new FileInputStream("fos.txt");
        
        int ch=0;
		while((ch=fis.read())!=-1)
		{
			System.out.println((char)ch);
		
		}
        fis.close();
   
        }
	
		public static void writeFile()throws IOException//д
        {
        FileOutputStream fos=new FileOutputStream("fos.txt");
     
        fos.write("ajdhjfh".getBytes());
		
    
        }
     //����Ҫˢ��
     }