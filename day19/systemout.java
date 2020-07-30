         /*
  字符流转为字节流  读取转换流
   
   */
   import java.io.*;
    class Readin
    {
       public static void main(String[] args)throws IOException 
       {
         //获取键盘录入对象
         
         /*InputStream  in=System.in;
         //将字节流对象转成字符流对象,使用转换 流,InputStreamReader
         InputStreamReader isr=new InputStreamReader(in);
         
         //为了提高效率,将字符串进行缓冲区技术高效操作,使用BufferedReader
         
         BufferedReader bufr=new BufferedReader(isr);
         */
         
         //以上三句话可以综合为一句    字符转字节
         
         BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
         
      
      
         /*下面同理  字节转字符

         OutputStream out=System.out;
         OutputStreamWriter osw=new OutputStreamWriter(out);
         BufferedWriter bufw=new BufferedWriter(osw);
         */
         
         
    BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));
         
         
         String line=null;
         
         while((line=bufr.readLine())!=null)
           { if("over".equals(line))//y遇到over停止
         break;
           bufw.write(line.toUpperCase());
             bufw.newLine();
             
           bufw.flush();
           }
         bufr.close();
          
       }

    }