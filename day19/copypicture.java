/*
����һ��ͼƬ 

���ֽڶ�ȡ�������ͼƬ����
���ֽ�д����������һ��ͼƬ�ļ�,���ڴ洢��ȡ����ͼƬ����
ͨ��ѭ����д������ݴ洢
�ر���Դ
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
			throw new RuntimeException("�����ļ�ʧ��");
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
			throw new RuntimeException("��ȡ�ر�ʧ��");
		 
		 }
		 
		 
		  try
		 {
			 if(fos!=null)
			 fos.close();
		 
		 }
		 catch(Exception e)
		 {
		 throw new RuntimeException("д��ر�ʧ��");
		 
		 }
	 
		 }
 
	 }

	}