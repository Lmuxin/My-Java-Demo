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
      
    //一次读一个字节,从缓冲区(字符数组)中获取
    public int myRead()throws  IOException
    { 
       //通过in对象读取硬盘上数据,并存储在buf中
       
       if(count==0)
       {
          count=in.read(buf); 
          if(count<0)
          return-1;   
          pos=0;
         
          byte b= buf[pos];
          count--;
          pos++;
          return b&255; //保证不是-1
           
       }
       else if(count>0)
       {
          byte b= buf[pos];
          count--;
          pos++;
          return b%oxff;//也是&255
       }
    }
     public vois myclose()throws  IOException 
     {
        in.close(); 
     }
     
  }