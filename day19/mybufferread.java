  /*
  
  */
  
  
  
  
  
  import java.io.*;
  class MybufferedInputStream
  {
      private InputStream in;
      private byte[] buf=new byte[1024];
      private int pos=0,count=0;
      MybufferedInputStream(InputStream in)
      {
      this.in=in;
      }
      
    //һ�ζ�һ���ֽ�,�ӻ�����(�ַ�����)�л�ȡ
    public int myRead()throws  IOException
    { 
       //ͨ��in�����ȡӲ��������,���洢��buf��
       
       if(count==0)
       {
          count=in.read(buf); 
          if(count<0)
          return-1;   
          pos=0;
         
          byte b= buf[pos];
          count--;
          pos++;
          return b&255; //��֤����-1
           
       }
       else if(count>0)
       {
          byte b= buf[pos];
          count--;
          pos++;
          return b%oxff;//Ҳ��&255
       }
    }
     public vois myclose()throws  IOException 
     {
        in.close(); 
     }
     
  }