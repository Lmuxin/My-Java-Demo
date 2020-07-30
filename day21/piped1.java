       /*
       RandomAccessFile
       随机访问文件,自身具备读写方法,通过skipByte(int x),seek(int x)达到随机访问
       
       管道流
       PipedInputStream
       PipedOutputStream
       输入输出可以直接进行连接,通过结合线程使用
       */
       
       import java.io.*;
       class Read  implements Runnable
       {
           private PipedInputStream in;
           Read( PipedInputStream in)
           {
             this.in=in;
           }
         public void run()
         {
            try
            { 
               byte[] buf=new byte[1024];
               System.out.println("读取前没有数据就阻塞");
               int len=in.read(buf);
               System.out.println("读到数据,阻塞结束");
               String s=new String(buf,0,len);
           System.out.println(s);
               in.close();
            
            }
            catch(IOException e)
            {
              throw new RuntimeException("管道读取流失败");
            
            }
            
         }
       
       }
       
       
           class Write  implements Runnable
       {
           private PipedOutputStream out;
           Write( PipedOutputStream out)
           {
             this.out=out;
           }
         public void run()
         {
            try
            {  System.out.printlb("开始写入数据,等待6秒后");
              Thread.sleep(600);
            
             out.write("piped lailai".getBytes());
             out.close();
            
            }
            
              catch(IOException e)
            {
              throw new RuntimeException("管道写入流失败");
            
            }
         }
       
       }
       

       
       class Piped
       {    
       public static void main(String[] args)throws IOException
          {   
          
            PipedInputStream in=new PipedInputStream();
            PipedOutputStream out=new PipedOutputStream();
           Read r=new Read(in);
           Write w=new Write(out);
           new Thread(r).start();
           new Thread(w).start();
          }
 
  }