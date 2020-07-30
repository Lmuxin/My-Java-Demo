   /*
   读取键盘录入
   System.out对应标准输出设备,就是屏幕
   System.in 对应标准输入设备,就是键盘
   
   */
   import java.io.*;
    class Readin
    {
       public static void main(String[] args)throws IOException
       {
        InputStream in=System.in;
        int by=in.read();
        System.out.println(by);
        
      StringBuilder sb=new StringBuilder();
      
        
        while(true)
        {
          int ch=in.read();
          if(ch=='\r')
          continue;
          if(ch=='\n')
          {
              String s=sb.toString();
              if("over".equals(s))
              break;
              System.out.println(s.toUpperCase());
              sb.delete(0,sb.length());         
          }
          else
          sb.append((char)ch);
        
        }
         }

    }