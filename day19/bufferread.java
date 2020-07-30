  /*
  缓冲区 ,是为了提高流的操作效率而生,所以在创建缓冲区之前,必须要现有流对象
  读取流缓冲区提供了一个一次读一行的方法  readLine() ,方便对文本数据的获取
  当返回null时表示读到文件末尾
  */
  
  
   import  java.io.*;
    class BufferRead
    {
    
        public static void main(String[] args)throws IOException
        {
            //创建一个字符读取流对象
            
            FileReader fr=new FileReader("buf.txt");
            
            //为了提高字符读取流的效率,加入了缓冲技术
            //将字符流对象作为参数传递给缓冲区的构造函数即可
            BufferedReader bufr=new BufferedReader(fr);
            
           String s1=bufr.readLine();//一次读取一行
             System.out.println(s1);
             
              
             
           String line =null;
           while((line=bufr.readLine())!=null)
           {
             System.out.println(line);
           }
     
          
            bufr.close();
        
        }
    
    }