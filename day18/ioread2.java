    /*
    IO�ı��ļ���ȡ��ʽ�ڶ���
    */
    
    import java.io.*;
    class IoDemo5
    { 
      public static void main(String[] args) throws IOException
        { 
       
        
         
         FileReader  fr=new FileReader("demo1.txt");
         
         //����һ���ַ�����,���ڴ洢��ȡ�����ַ�
         //��read(char[])���ص��Ƕ������ַ�����
         char[] buf=new char[1024];
           
          int num=  fr.read(buf);//�Ѷ������ַ������ַ�����
         System.out.println(num+"....."+new String(buf));
         
         
         //Ҳ����д��ѭ����ʽ
         
         int  nu=0;
         while(nu=fr.read(buf))!=-1)
         {
           System.out.println(new String(buf,0,nu));
         
         }
         
         
         fr.close();
          }
     }