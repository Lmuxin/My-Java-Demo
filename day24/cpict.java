/*
     需求 :客户端并发上传图片
   
     
     */
     
     /*
     客户端
     1/服务端点
     2.读取客户端已有的图片数据
     3.通过socket输出流将数据发给服务端
     4.读取服务端反馈信息
     5.关闭
     
     
     为了可以让多个客户端同时并发访问服务端,服务端最好就是将每个客户端封装到一个单独线程中,这样就可以同时处理多个客户端请求
     */
     
     /*如何定义线程?
     只要明确了每一个客户端要在服务端执行的代码即可,将该代码存入run方法中
     

     */ 
     
      import java.io.*; 
    import java.net.*; 
       
   
       class   PClient5
    {
        public static void main(String[] args) throws Exception
        {  
              if(args.length!=1)
              {
                System.out.println("请选择一个jpg图片");
                return;
                
              }
        
        
           File file=new File(args[0]);
            
              if(!(file.exists() && file.isFile()))//这里多了一个小冒号,竟然花了几个小时都找不出来,对比源代码一次又i一次,怎么就看不到呢,瞎吗 fuck
              {
                  System.out.println("该文件有问题,要么存在,要么不是文件");
                  return;
              
              }
              
              
              
              
           
              
             if(!file.getName().endsWith(".jpg"))
              {
                 System.out.println("图片格式错误,请重新选择");
                 return;
              
              }
           
            if(file.length()>1024*1024*5)
            {
            System.out.println("文件过大,没安好心");
            return;
            }
  
             Socket s=new Socket("192.169.1.255",10007);
                
                FileInputStream fis=new FileInputStream(file);
                OutputStream out=s.getOutputStream();
                
             byte[] buf=new byte[1024];
             int len=0;

             while((len=fis.read(buf))!=-1)
             {

               out.write(buf,0,len);
                            
             }
             //告诉服务端数据已经写完
             s.shutdownOutput();
            InputStream in=s.getInputStream();
            byte[] bufin=new byte[1024];
            int num=in.read(bufin);
            
           
            System.out.println(new String(bufin,0,num));
            
            fis.close();
              s.close();
        }

    }  
    
    
   
  
    
    
  /*
    
    import java.io.*;
import java.net.*;
class  PicClient
{
	public static void main(String[] args)throws Exception 
	{
		if(args.length!=1)
		{
			System.out.println("请选择一个jpg格式的图片");
			return ;
		}




		File file = new File(args[0]);
		if(!(file.exists() && file.isFile()))
		{
			System.out.println("该文件有问题，要么补存在，要么不是文件");
			return ;

		}

		if(!file.getName().endsWith(".jpg"))
		{
			System.out.println("图片格式错误,请重新选择");
			return ;
		}

		if(file.length()>1024*1024*5)
		{
			System.out.println("文件过大，没安好心");
			return ;
		}
		



		Socket s = new Socket("192.168.1.254",10007);

		FileInputStream fis = new FileInputStream(file);

		OutputStream out = s.getOutputStream();

		byte[] buf = new byte[1024];

		int len = 0;

		while((len=fis.read(buf))!=-1)
		{
			out.write(buf,0,len);
		}

		//告诉服务端数据已写完
		s.shutdownOutput();

		InputStream in = s.getInputStream();

		byte[] bufIn = new byte[1024];

		int num = in.read(bufIn);
		System.out.println(new String(bufIn,0,num));

		fis.close();
		s.close();
	}
}
*/
 
    
     class PicThread implements Runnable
     {
     
        private Socket  s;
        PicThread(Socket s)
        {
           this.s=s;
  
        }
        
        
        public void run()
        {
        
            int count=1;
             String ip=s.getInetAddress().getHostAddress();
          try 
            {
        
                System.out.println(ip+".....connected");
               InputStream in=s.getInputStream();
               
               File dir =  new File("d:\\pic");
               
               
               File file=new File(dir,ip+"("+(count)+")"+".jpg");//192.168.1.254(1)
               
               
               while(file.exists())
               
               
               file=new File(dir,ip+"("+(count++)+")"+".jpg");//192.168.1.254(1)
               
               
                 FileOutputStream fos=new FileOutputStream(file);
                 
                 byte[] buf=new byte[1024]; 
                  
                  int len=0;
                  while((len=in.read(buf))!=-1)
                  {
                     fos.write(buf,0,len);
                  
                  }
                 OutputStream out=s.getOutputStream();
                 out.write("上传成功".getBytes());
                 
     
                 fos.close();
                  s.close();
                
            }
                 catch(Exception e)
                   {
                     throw new RuntimeException(ip+"上传失败");
                   }
        }
     
     }
     

    
       
    /*
       服务端  
    
    
    
    */
        class Server5
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             while(true)
             {
               Socket s=ss.accept();
              new Thread(new PicThread(s)).start();
              
              }
              
        }
 
    }