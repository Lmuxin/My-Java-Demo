         /*
         TCPC����
         
         1.tcp�ֿͻ��˺ͷ����
         2.�ͻ��˶�Ӧ�Ķ�����Socket
            ����˶�Ӧ�Ķ�����ServerSocket
       */
     /*
     
     �ͻ���:ͨ������socket����,�����ڸö�����ʱ,�Ϳ���ȥ����ָ������
        ��Ϊtcp���������ӵ�,�����ڽ���socket����ʱ,��Ҫ�з���˴���,�����ӳɹ�,�γ�ͨ·��,�ڸ�ͨ���������ݴ���
        
        
        ����:������˷����ı�����
        ����;
        1/����Socket����,��ָ��Ҫ���ӵ������Ͷ˿�
     
     */   
        
 
         import java.net.*; 
         import java.io.*; 
         //�ͻ���
    class   Kehu
    {
        public static void main(String[] args)throws Exception
        {  
            //����socket�Ŀͻ��˷���,ָ��Ŀ�������Ͷ˿�
             Socket s=new Socket("192.169.1.255",10000);
             //Ϊ�˷�������,Ӧ�û�ȡsocket���е������
             OutputStream out=s.getOutputStream();
             out.write("dhjhdh".getBytes());
             
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
        class Server
    {
        public static void main(String[] args)throws Exception  
        {  
            //��������˵�socket����,������һ���˿�
             ServerSocket ss=new ServerSocket(10000);
             
             //ͨ��accept������ȡ���ӹ����Ŀͻ��˶���
               Socket s=ss.accept();
               String ip=s.getInetAddress().getHostAddress();
               System.out.println(ip+"....������");
               
        
          //��ȡ�ͻ��˷���������,Ҫʹ�ÿͻ��˶���Ķ�ȡ������ȡ����
          InputStream in=s.getInputStream();

            byte[]  buf=new byte[1024];
            int len=in.read(buf);
            System.out.println(new String(buf,0,len));

            s.close();//�رտͻ���

        }
 
    }
    
    
    
    
    
    
    
    
    
    
                                                    