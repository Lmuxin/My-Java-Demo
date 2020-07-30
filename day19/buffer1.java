  /*
  缓冲区 ,是为了提高流的操作效率而生,所以在创建缓冲区之前,必须要现有流对象
  该缓冲区中提供了一个跨平台的换行符
  */
  
  
   import  java.io.*;
    class BufferDemo
    {
    
        public static void main(String[] args)throws IOException
        {
            //创建一个字符写入流对象
            
            FileWriter fw=new FileWriter("buf.txt");
            
            //为了提高字符写入流的效率,加入了缓冲技术
            //只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可
            BufferedWriter bufw=new BufferedWriter(fw);
            
            bufw.write("abced");//   windows下  \r\n是换行   linux下 \n是换行
            bufw.newLine();//换行,在windows和linux下都适用
                
            //只要用到缓冲区就要记得刷新
            bufw.flush(); 
            
            //其实关闭缓冲区,就是在关闭缓冲区中的流对象
            bufw.close();
        
        }
    
    }