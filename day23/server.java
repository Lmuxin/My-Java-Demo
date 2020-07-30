         /*
         TCPC传输
         
         1.tcp分客户端和服务端
         2.客户端对应的对象是Socket
            服务端对应的对象是ServerSocket
       */
     /*
     
     客户端:通过查阅socket对象,发现在该对象建立时,就可以去连接指定主机
        因为tcp是面向连接的,所以在建立socket服务时,就要有服务端存在,并连接成功,形成通路后,在该通道进行数据传输
        
        
        需求:给服务端发送文本数据
        步骤;
        1/创建Socket服务,并指定要连接的主机和端口
     
     */   
        
 
         import java.net.*; 
         import java.io.*; 
         //客户端
    class   Kehu
    {
        public static void main(String[] args)throws Exception
        {  
            //创建socket的客户端服务,指定目的主机和端口
             Socket s=new Socket("192.169.1.255",10000);
             //为了发送数据,应该获取socket流中的输出流
             OutputStream out=s.getOutputStream();
             out.write("dhjhdh".getBytes());
             
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
        class Server
    {
        public static void main(String[] args)throws Exception  
        {  
            //创建服务端的socket服务,并监听一个端口
             ServerSocket ss=new ServerSocket(10000);
             
             //通过accept方法获取连接过来的客户端对象
               Socket s=ss.accept();
               String ip=s.getInetAddress().getHostAddress();
               System.out.println(ip+"....连接了");
               
        
          //获取客户端发送来的书,要使用客户端对象的读取流来读取数据
          InputStream in=s.getInputStream();

            byte[]  buf=new byte[1024];
            int len=in.read(buf);
            System.out.println(new String(buf,0,len));

            s.close();//关闭客户端

        }
 
    }
    
    
    
    
    
    
    
    
    
    
                                                    