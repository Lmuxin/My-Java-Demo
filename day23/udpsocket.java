       /*
         Socket
         
         ����:ͨ��udp���䷽ʽ��һ���������ݷ��ͳ�ȥ
         ˼·:
         1.�Ƚ���Udp��Socket����
         2.�ṩ���ݲ������ݷ�װ�����ݰ���
         3.ͨ��socket����ķ��͹��ܰ����ݰ����ͳ�ȥ
         4.�ر���Դ
  
       */
           //���Ͷ�
         import java.net.*; 
          import java.io.*; 
           class UdpSend
         {
             public static void main(String[] args)throws Exception
             {
                 //����UDP����,ͨ��DatagramSocket����
                 
                  DatagramSocket ds=new DatagramSocket();
                  BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
                  String line=null;
                  while((line=bufr.readLine())!=null)
                  {
                    if("886".equals(line))
                    break;
                    
                    byte[] buf=line.getBytes();
               
                  
                     //ȷ�����ݲ���װ�����ݰ�
                     //byte[] data="udp hbdbj".getBytes();//���ݱ���ֽ�����
                     DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("169.254.89.44"),10000);
                     
                     //ͨ��socket��������е����ݰ����ͳ�ȥ,ͨ��send����
                     ds.send(dp);
                 }
                 
                 //�ر���Դ 
                 ds.close();
             }

         }
         
         
         /*
         ���ն�  Ӧ�ó���,���ղ�����udpЭ�鴫�������
         ˼·"
         1.����udpsocket����,ͨ�������һ���˿�,��ʵ���Ǹ������������Ӧ�ó��������ֱ�ʶ
            ������ȷ��Щ���ݹ�����Ӧ�ó�����Դ���
         2.����һ�����ݰ�,Ҫ�洢���յ����ֽ�����,
           ��Ϊ���ݰ��������и��๦�ܿ�����ȡ�ֽ������еĲ�ͬ������Ϣ
         3.ͨ��socket�����receive�������յ������ݴ����Ѿ�����õ����ݰ���
         4.ͨ�����ݰ���������й���,����ͬ����ȡ��,��ӡ�ڿ���̨
          5.�ر���Դ
         */ 
      
           class UdpReceive
         {
             public static void main(String[] args)throws Exception
             {
             //����udpsocket�������˵�
              
              DatagramSocket ds=new DatagramSocket(10000);
            while(true)
            { 
             //�������ݰ�,���ڴ洢����
             byte[] buf=new byte[1024];
             DatagramPacket dp=new DatagramPacket(buf,buf.length);
             
             //ͨ�������receive���������յ������ݴ�����ݰ���
             ds.receive(dp);//����ʽ����
             
             //ͨ�����ݰ��ķ�����ȡ����
              String ip=dp.getAddress().getHostAddress();
             String data= new String(dp.getData(),0,dp.getLength()); 
      
              int port=dp.getPort();
              System.out.println(ip+",,,,"+data+",,,"+port);
              }
           
              }
         } 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         