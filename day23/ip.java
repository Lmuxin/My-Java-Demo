       /*
      
      ��̨����ͨ��
        1.�����ҵ��Է���IP��ַ
        2.����Ҫ���͵��Է�ָ����Ӧ�ó�����,Ϊ�˱�ʶ��Щ����,���Ը���Щ����Ӧ�ó��������ֽ��б�ʶ,Ϊ�˷���ƺ���Щ����,�ͽж˿�,���߼��˿�
        3.��Ҫ����һ��ͨ�Ź���,���ͨ�Ź������Э��.������֯������ͨ�õ�Э��TCP/IP
      
      ������ 
         |--����ģ��
              --OSI�ο�ģ��
              --TCP/IP�ο�ģ��
                ���ݷ��   ���ݲ��
         |--����ͨ��Ҫ��
              --IP��ַ
              --�˿ں�
              --����Э��
  
       */
           
         import java.net.*; 
   
   
           class IpDemo
         {
             public static void main(String[] args)throws Exception
             {
                  InetAddress i= InetAddress.getLocalHost();//��ȡ�����������͵�ַ
                  System.out.println(i.toString());
                System.out.println("Address::"+i.getHostAddress());//ֻ��ȡ������ַ
              System.out.println("name::"+i.getHostName());//ֻ��ȡ��������
              
              
              
              
              InetAddress ia=InetAddress.getByName("192.168.1.1");//ͨ��ip��ַ��ȡ����һ̨���Ե�����
              System.out.println("Address::"+ia.getHostAddress());
              System.out.println("name::"+ia.getHostName());
              
              
               InetAddress ib=InetAddress.getByName("www.baidu.com");//ͨ���ٶ��������ƻ�ȡ������ַ
              System.out.println("Address::"+ib.getHostAddress());
              System.out.println("name::"+ib.getHostName());
 
             }

         }
          