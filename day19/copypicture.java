/*
拷贝一个图片 

用字节读取流对象和图片关联
用字节写入流对象建立一个图片文件,用于存储获取到的图片数据
通过循环读写完成数据存储
关闭资源
*/    
    import java.io.*;
	class CopyPicture
		{
		public static void main(String[] args)
		 {
			 FileOutputStream  fos=null;
			 FileInputStream   fis=null;
			 try
			 {
				 fos=new FileOutputStream("c:\\2.bmg");
				 fis=new FileInputStream("c:\\1.bmg");
				 
				 byte[] buf=new byte[1024];
				 int len=0;
				 while((len=fis.read(buf))!=-1)
				
				{
				 fos.write(buf,0,len);
				}
			 }
		 catch(Exception e)
		 {
			throw new RuntimeException("复制文件失败");
		 }
		 
		 
		 finally
		 {
			try
			 {
				  if(fis!=null)
				  fis.close();
			 
			 }
		 catch(Exception e)
		 {
			throw new RuntimeException("读取关闭失败");
		 
		 }
		 
		 
		  try
		 {
			 if(fos!=null)
			 fos.close();
		 
		 }
		 catch(Exception e)
		 {
		 throw new RuntimeException("写入关闭失败");
		 
		 }
	 
		 }
 
	 }

	}