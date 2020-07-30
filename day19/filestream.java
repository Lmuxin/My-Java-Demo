   /*想要操作图片数据,就要用到字节流
   
   字节流  InputStream(读)  OutputStream(写)
   */
     import java.io.*;
     class  Filestream
     {
     
     public static void main(String[] args)throws IOException
     {
     
       writeFile();
     
     }
	 
	 public static void readFile_3()throws IOException//读取第三个方法 读了存起来 在输出
        {
			
        FileInputStream fis=new FileInputStream("fos.txt");
        
		int num=fis.available();//可以得出文本中有多少个字符 , \r    \n分别是一个字符
		
		byte[] buf=new Byte[fis.available()];//定义一个刚刚好的 数组
		
		 fis.read(buf);
		
	     System.out.println(new String(buf));

          fis.close();
        }
		
	
	 public static void readFile_2()throws IOException//读取第一个方法 读了存起来 在输出
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
		

        public static void readFile_1()throws IOException//读取第二个方法  一个一个读
        {
			
        FileInputStream fis=new FileInputStream("fos.txt");
        
        int ch=0;
		while((ch=fis.read())!=-1)
		{
			System.out.println((char)ch);
		
		}
        fis.close();
   
        }
	
		public static void writeFile()throws IOException//写
        {
        FileOutputStream fos=new FileOutputStream("fos.txt");
     
        fos.write("ajdhjfh".getBytes());
		
    
        }
     //不需要刷新
     }