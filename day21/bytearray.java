       /*
      用于操作字节数组的流对象 
      ByteArrayInputStream 在构造的时候,需要接收数据源,而且数据源是一个字节数组
      ByteArrayOutputStream  在构造的时候,不用定义数据目的,因为该对象中已经内部封装了可变长度的字节数组,这就是数据目的地
      
      因为这两个流对象都操作数组,并没有使用资源所以,不用惊醒close关闭
      
      流操作规律讲解时
      源设备:
             键盘 System.in   硬盘FileStream   内存 ArrayStream
      目的设备
            控制台 System.out  硬盘FileStream   内存 ArrayStream 
            
            
            
      
       */
       
       import java.io.*;
       class Bytearray
       {
          
          public static void main(String[] args)throws IOException
          {   
         //数据源
         ByteArrayInputStream  bis=new ByteArrayInputStream("hudfhdh".getBytes());
         //目的地
         ByteArrayOutputStream bos=new ByteArrayOutputStream();
         
         int by=0;
         while((by=bis.read())!=-1)
         {
         
         bos.write(by);
         }
   
         System.out.println(bos.size());
    
          }
          
         

  }