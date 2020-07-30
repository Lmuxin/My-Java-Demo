      /*
      自己做一个bufferedreader类 
      
      明白了BufferedReader类中特有方法readLine()的原理后,可以自定义一个类中包含一个功能
      和readLine一致的方法来模拟一下BufferedReader
      
      
      */
      import java.io.*;
      class  MyBufferReader
      {  
          private FileReader r;
          
          MyBufferReader(FileReader r)
          {
          this.r=r;
          }
      
         //可以一次读一行数据的方法
         
         public String myReadLine()throws IOException
         {
          //定义一个临时的容器,原来BufferReader封装的是字符数组
          //为了方便,定义一个StringBuilder容器,因为最终还是要将数据变成字符串
          
          StringBuilder sb=new StringBuilder();
          int ch=0;
          while((ch=r.read())!=-1)
          {
          
           if(ch=='\r')
           continue;
           
           if(ch=='\n')
           return sb.toString();
           
          else
            sb.append((char)ch);

          }
          if(sb.length()!=0)
          return sb.toString();
          return null;
         
         }
         
         public void myclose() throws IOException
         {
           r.close();
         }

      
      }
    
      class mubufferdemo
      {
      public static void main(String[] args) throws IOException
      {
        FileReader fr=new FileReader("buf.txt");
        MyBufferReader  mb=new MyBufferReader(fr);
        String line=null;
        while((line=mb.myReadLine())!=null)
        {
        
        System.out.println(line);
        
        }
        mb.myclose();
      
      }
      
      
      }