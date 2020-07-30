   /*
  字节流转为字符流  读取转换流
   
   */
   import java.io.*;
    class Readin
    {
       public static void main(String[] args)throws IOException 
       {
         //获取键盘录入对象
         
         InputStream  in=System.in;
         //将字节流对象转成字符流对象,使用转换 流,InputStreamReader
         InputStreamReader isr=new InputStreamReader(in);
         
         //为了提高效率,将字符串进行缓冲区技术高效操作,使用BufferedReader
         
         BufferedReader bufr=new BufferedReader(isr);
         
         String line=null;
         
         while((line=bufr.readLine())!=null)
           { if("over".equals(line)//y遇到over停止
           return;
            System.out.println(line.toUpperCase());
           }
         bufr.close();
          
       }

    }