         /*
         ��дһ���������
         �н������ݺͷ������ݲ���,����������Ҫͬʱִ��,��Ҫ�õ����߳�,һ���߳���,һ���̷߳�
        �պͷ��ǲ�һ�µ�,����Ҫ��������run����,������������Ҫ��װ����ͬ������
       */
           //���Ͷ�
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
             throw new RuntimeException("���Ͷ�ʧ��");
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
             throw new RuntimeException("���ն�ʧ��");
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