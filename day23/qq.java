         /*
         编写一个聊天程序
         有接收数据和发送数据部分,这两部分需要同时执行,需要用到多线程,一个线程收,一个线程发
        收和发是不一致的,所以要定义两个run方法,而且两个方法要封装到不同的类中
       */
           //发送端
         import java.net.*; 
          import java.io.*; 
           class Send implements Runnable
         {   
             private DatagramSocket ds;
           Send(DatagramSocket ds)
            {
            
            this.ds=ds;
            
            }
         
         public void run()
         {
           try
           {
               BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
               String line=null;
               while((line=bufr.readLine())!=null)
               {
                  if("886".equals(line))
                  break;
                  
                  byte [] buf=line.getBytes();
                  DatagramPacket  dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.255"),10000);
               
                     ds.send(dp);
               
               }
           
           }
           
           catch(Exception e)
           {
             throw new RuntimeException("发送端失败");
           }
         
         }
         
   }
         
   
            
           class Rece implements Runnable
         {
             private DatagramSocket ds;
              Rece(DatagramSocket ds)
            {
            
            this.ds=ds;
            
            }
         
         public void run()
         {
           try
           {
                while(true)
                  {  byte[] buf=new byte[1024];
                
                  DatagramPacket dp=new DatagramPacket(buf,buf.length);
                  ds.receive(dp);
                  String ip=dp.getAddress().getHostAddress();
                  String data=new String(dp.getData(),0,dp.getLength());
                    System.out.println(ip+"..."+data); 
                  }
           
           }
           
           catch(Exception e)
           {
             throw new RuntimeException("接收端失败");
           }
 
         }
    } 
    
    
    
    class   QQ
    {
        public static void main(String[] args)throws Exception
        {
             DatagramSocket sendSocket=new DatagramSocket();
              DatagramSocket receSocket=new DatagramSocket(10000);
              new Thread(new Send(sendSocket)).start();
               new Thread(new Rece(receSocket)).start();
 
        }
    
 
    }