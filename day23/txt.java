  /*
     需求 :建立一个文本传输服务器
     客户端给服务端发送文本,服务端会将文本转成大写再返回给客户端,而且客户端可以不断的进行文本转换,当客户端输入over时,结束
     
     分析
     客户端;  既然是操作设备上的数据 ,就可以使用io技术,并按照io操作规律来思考
        源;键盘
        目的:网络设备,网络输出流
        而且操作的是文本数据,可以选择字符流
        
        步骤:
        1.建立服务
        2.获取键盘输入
        3.将数据发送给服务端
        4.获取服务端返回的数据
        5.关闭资源
        
        都是文本数据,可以使用字符流进行操作
     
     */
     
     
           //客户端
         import java.net.*; 
         import java.io.*; 
   
       class   Client2
    {
        public static void main(String[] args)throws Exception
        {  
            
             Socket s=new Socket("192.169.1.255",10000);
             
             //定义读取键盘数据的流对象
             BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
             
              //定义目的,将数据写入到socket输出流,发给客户端
             
             BufferedWriter bufout=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
             
             
             //定义一个socket读取流,读取服务端返回来的信息
             
              BufferedReader bufin=new BufferedReader(new InputStreamReader(System.in));
             
             
             
             String line=null;
             while((line=bufr.readLine())!=null)
             {
                if("over".equals(line))
                break;
                bufout.write(line);
                bufout.newLine();
                bufout.flush();
                String str=bufin.readLine();
                System.out.println("server::"+str);             
             }
   
             bufr.close();
             s.close();
        }

    }     
    /*服务端  
    源:socket读取流
    目的;socket输出流
    都是文本 装饰一下
    
    
    */
        class Server3
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             
               Socket s=ss.accept();
               
               String ip=s.getInetAddress().getHostAddress();
               System.out.println(ip+".....connected");
               
               
               //读取socket读取流中的数据
               BufferedReader bufin=new BufferedReader(new InputStreamReader(s.getInputStream()));
               
               
               //目的,socket输出流将大写数据写入到socket输出流并发送给客户端
               
               BufferedWriter bufout=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
               
               
               String line=null;
               while((line=bufin.readLine())!=null)
               {
                  bufout.write(line.toUpperCase());
                  bufout.newLine();
                  bufout.flush();
      
               }
               
               
               s.close();
               ss.close();
      
        }
 
    }
    