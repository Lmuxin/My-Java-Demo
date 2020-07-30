    /*
    IO文本文件读取方式
    */
    
    import java.io.*;
    class IoDemo4
    { 
      public static void main(String[] args) throws IOException
        { 
       
        //第一步::创建一个文件读取流对象,和指定名称的文件相关联
        //要保证该文件是已经存在的,若不存在,会发生异常 FileNotFoundException
         FileReader  fr=new FileReader("demo1.txt");
         
         
          //第二步::调用读取流的read方法
          //read方法一次只读一个字符,而且会自动往下读,把读取的字符变成整数输出,若读到末尾会返回-1
         // int ch=  fr.read();
         // System.out.println(ch);
         
         //下面是用循环输出,比较方便 
          /*while(true)
          {
          int ch=  fr.read();
          if(ch==-1)
          brak;
            System.out.println(ch);
          }
          */
          //再一个循环
          int ch=0;
          while((ch=fr.read())!=-1)
          {
             System.out.println(ch);
          
          }
      
          fr.close();
                
      
          }
     }