    /*
    IO流是用来操作数据的,那么数据最常见的操作形式 是文件 所以以操作文件作为演示
  
    找到一个专门用于操作文件袋 Writer子类对象 FileWriter  后缀名是父类名,前缀名是该流对象的功能
    */
    
    import java.io.*;
    class IoDemo
    {
      public static void main(String[] args) throws IOException
      {
      
        //第一步:创建一个FileWriter对象,该对象一被初始化就必须明确被操作的文件
        //而且该文件会被创建到指定目录下
        //如果目录下已有同名目录,会覆盖掉原来的文件
        //其实改步就是在明确数据要存放的目的地
          
        FileWriter fw=new FileWriter("demo.txt");//即使文件不存在,编译也通过,这句话会创建一个demo.txt
        
        
        //第二步:调用write方法,将字符串写入到流中
          fw.write("abdcj");
      
      
         //第三步:刷新流对象中的缓冲区中的数据,把数据刷到目的地去
         fw.flush();
         
         
         //关闭流资源,但是关闭之前会刷新一次内部的缓冲中的数据,将数据刷到目的地中
          //和flush区别是  flush刷新后,流可以继续使用,close刷新后,流会关闭.
         fw.close();
    
         
      }
    
   }