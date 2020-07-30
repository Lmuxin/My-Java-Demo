       /*
      
      两台电脑通信
        1.首先找到对方的IP地址
        2.数据要发送到对方指定的应用程序上,为了标识这些程序,所以给这些网络应用程序用数字进行标识,为了方便称呼这些数字,就叫端口,是逻辑端口
        3.还要定义一个通信规则,这个通信规则叫做协议.国际组织定义了通用的协议TCP/IP
      
      网络编程 
         |--网络模型
              --OSI参考模型
              --TCP/IP参考模型
                数据封包   数据拆包
         |--网络通信要素
              --IP地址
              --端口号
              --传输协议
  
       */
           
         import java.net.*; 
   
   
           class IpDemo
         {
             public static void main(String[] args)throws Exception
             {
                  InetAddress i= InetAddress.getLocalHost();//获取本机主机名和地址
                  System.out.println(i.toString());
                System.out.println("Address::"+i.getHostAddress());//只获取本机地址
              System.out.println("name::"+i.getHostName());//只获取本机名称
              
              
              
              
              InetAddress ia=InetAddress.getByName("192.168.1.1");//通过ip地址获取任意一台电脑的名称
              System.out.println("Address::"+ia.getHostAddress());
              System.out.println("name::"+ia.getHostName());
              
              
               InetAddress ib=InetAddress.getByName("www.baidu.com");//通过百度主机名称获取主机地址
              System.out.println("Address::"+ib.getHostAddress());
              System.out.println("name::"+ib.getHostName());
 
             }

         }
          