         /*
      tcp����ͻ��˺ͷ���˻���
      ����:�ͻ��˸�����˷�������,������յ���,���ͻ��˷�����Ϣ
     /*
     
     
     /*
     �ͻ���:
       
        ����;
        1 .����socket�Ŀͻ��˷���,ָ��Ŀ�������Ͷ˿�
        2.��ȡsocket���е������,������д��������,ͨ�����緢�͸������
        3.��ȡsocket���е�������,������˷��������ݻ�ȡ��,����ӡ
        4.�رտͻ�����Դ
     */   
        
 
         import java.net.*; 
         import java.io.*; 
         //�ͻ���
    class   Client
    {
        public static void main(String[] args)throws Exception
        {  
            
             Socket s=new Socket("192.169.1.255",10000);
             
             
             OutputStream out=s.getOutputStream();
             out.write("�����,���".getBytes());
             
             InputStream in=s.getInputStream();
             
             byte[] buf=new byte[1024];
             int len=in.read(buf);
             System.out.println(new String(buf,0,len));
             
        
             s.close();
 
        }
    
 
    }     
    /*�����  ����˵� �������ݲ���ӡ������̨
    
      1.��������˵�socket����,ServerSocket(); ������һ���˿�
      2.��ȡ���ӹ����Ŀͻ��˶���,ͨ��ServeSocket��accept����
        �������������ʽ��,û�����Ӿͻ��
        3.�ͻ�������������,��ô�����Ҫʹ�ö�Ӧ�Ŀͻ��˶���,����ȡ���ÿͻ��˶���Ķ�ȡ������ȡ���������ݲ���ӡ������̨
        4.�ر���Դ(��ѡ����)
    
    
    */
        class Server2
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             
               Socket s=ss.accept();
               
               String ip=ss.getInetAddress().getHostAddress();
               System.out.println(ip+"....������");
               
               InputStream in=s.getInputStream();
             
             byte[] buf=new byte[1024];
             int len=in.read(buf);
             System.out.println(new String(buf,0,len));
               
               
              OutputStream out=s.getOutputStream();
              out.write("�����յ�,��Ҳ��".getBytes());

        }
 
    }
    