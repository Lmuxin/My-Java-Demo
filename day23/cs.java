         /*
      tcp传输客户端和服务端互访
      需求:客户端给服务端发送数据,服务端收到后,给客户端反馈信息
     /*
     
     
     /*
     客户端:
       
        步骤;
        1 .创建socket的客户端服务,指定目的主机和端口
        2.获取socket流中的输出流,将数据写到该流中,通过网络发送给服务端
        3.获取socket流中的输入流,将服务端反馈的数据获取到,并打印
        4.关闭客户端资源
     */   
        
 
         import java.net.*; 
         import java.io.*; 
         //客户端
    class   Client
    {
        public static void main(String[] args)throws Exception
        {  
            
             Socket s=new Socket("192.169.1.255",10000);
             
             
             OutputStream out=s.getOutputStream();
             out.write("服务端,你好".getBytes());
             
             InputStream in=s.getInputStream();
             
             byte[] buf=new byte[1024];
             int len=in.read(buf);
             System.out.println(new String(buf,0,len));
             
        
             s.close();
 
        }
    
 
    }     
    /*服务端  定义端点 接收数据并打印到控制台
    
      1.建立服务端的socket服务,ServerSocket(); 并监听一个端口
      2.获取连接过来的客户端对象,通过ServeSocket的accept方法
        这个方法是阻塞式的,没有连接就会等
        3.客户端若发来数据,那么服务端要使用对应的客户端对象,并获取到该客户端对象的读取流来读取发来的数据并打印到控制台
        4.关闭资源(可选操作)
    
    
    */
        class Server2
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             
               Socket s=ss.accept();
               
               String ip=ss.getInetAddress().getHostAddress();
               System.out.println(ip+"....连接了");
               
               InputStream in=s.getInputStream();
             
             byte[] buf=new byte[1024];
             int len=in.read(buf);
             System.out.println(new String(buf,0,len));
               
               
              OutputStream out=s.getOutputStream();
              out.write("哥们收到,你也好".getBytes());

        }
 
    }
    