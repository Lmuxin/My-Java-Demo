       /*
         Socket
         
         需求:通过udp传输方式把一段文字数据发送出去
         思路:
         1.先建立Udp的Socket服务
         2.提供数据并将数据封装到数据包中
         3.通过socket服务的发送功能把数据包发送出去
         4.关闭资源
  
       */
           //发送端
         import java.net.*; 
          import java.io.*; 
           class UdpSend
         {
             public static void main(String[] args)throws Exception
             {
                 //创建UDP服务,通过DatagramSocket对象
                 
                  DatagramSocket ds=new DatagramSocket();
                  BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
                  String line=null;
                  while((line=bufr.readLine())!=null)
                  {
                    if("886".equals(line))
                    break;
                    
                    byte[] buf=line.getBytes();
               
                  
                     //确定数据并封装成数据包
                     //byte[] data="udp hbdbj".getBytes();//数据变成字节数组
                     DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("169.254.89.44"),10000);
                     
                     //通过socket服务把已有的数据包发送出去,通过send方法
                     ds.send(dp);
                 }
                 
                 //关闭资源 
                 ds.close();
             }

         }
         
         
         /*
         接收端  应用程序,接收并处理udp协议传输的数据
         思路"
         1.定义udpsocket服务,通常会监听一个端口,其实就是给这个接收网络应用程序定义数字标识
            方便明确哪些数据过来该应用程序可以处理
         2.定义一个数据包,要存储接收到的字节数据,
           因为数据包对象中有更多功能可以提取字节数据中的不同数据信息
         3.通过socket服务的receive方法把收到的数据存入已经定义好的数据包中
         4.通过数据包对象的特有功能,将不同数据取出,打印在控制台
          5.关闭资源
         */ 
      
           class UdpReceive
         {
             public static void main(String[] args)throws Exception
             {
             //创建udpsocket服务建立端点
              
              DatagramSocket ds=new DatagramSocket(10000);
            while(true)
            { 
             //定义数据包,用于存储数据
             byte[] buf=new byte[1024];
             DatagramPacket dp=new DatagramPacket(buf,buf.length);
             
             //通过服务的receive方法将接收到的数据存放数据包中
             ds.receive(dp);//阻塞式方法
             
             //通过数据包的方法获取数据
              String ip=dp.getAddress().getHostAddress();
             String data= new String(dp.getData(),0,dp.getLength()); 
      
              int port=dp.getPort();
              System.out.println(ip+",,,,"+data+",,,"+port);
              }
           
              }
         } 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         