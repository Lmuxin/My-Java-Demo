    /*
    IO文本文件读取方式第二种
    */
    
    import java.io.*;
    class IoDemo5
    { 
      public static void main(String[] args) throws IOException
        { 
       
        
         
         FileReader  fr=new FileReader("demo1.txt");
         
         //定义一个字符数组,用于存储读取到的字符
         //该read(char[])返回的是读到的字符个数
         char[] buf=new char[1024];
           
          int num=  fr.read(buf);//把读到的字符放入字符数组
         System.out.println(num+"....."+new String(buf));
         
         
         //也可以写成循环形式
         
         int  nu=0;
         while(nu=fr.read(buf))!=-1)
         {
           System.out.println(new String(buf,0,nu));
         
         }
         
         
         fr.close();
          }
     }