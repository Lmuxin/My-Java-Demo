  /*
     ���� :����һ���ı����������
     �ͻ��˸�����˷����ı�,����˻Ὣ�ı�ת�ɴ�д�ٷ��ظ��ͻ���,���ҿͻ��˿��Բ��ϵĽ����ı�ת��,���ͻ�������overʱ,����
     
     ����
     �ͻ���;  ��Ȼ�ǲ����豸�ϵ����� ,�Ϳ���ʹ��io����,������io����������˼��
        Դ;����
        Ŀ��:�����豸,���������
        ���Ҳ��������ı�����,����ѡ���ַ���
        
        ����:
        1.��������
        2.��ȡ��������
        3.�����ݷ��͸������
        4.��ȡ����˷��ص�����
        5.�ر���Դ
        
        �����ı�����,����ʹ���ַ������в���
     
     */
     
     
           //�ͻ���
         import java.net.*; 
         import java.io.*; 
   
       class   Client2
    {
        public static void main(String[] args)throws Exception
        {  
            
             Socket s=new Socket("192.169.1.255",10000);
             
             //�����ȡ�������ݵ�������
             BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
             
              //����Ŀ��,������д�뵽socket�����,�����ͻ���
             
             BufferedWriter bufout=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
             
             
             //����һ��socket��ȡ��,��ȡ����˷���������Ϣ
             
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
    /*�����  
    Դ:socket��ȡ��
    Ŀ��;socket�����
    �����ı� װ��һ��
    
    
    */
        class Server3
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             
               Socket s=ss.accept();
               
               String ip=s.getInetAddress().getHostAddress();
               System.out.println(ip+".....connected");
               
               
               //��ȡsocket��ȡ���е�����
               BufferedReader bufin=new BufferedReader(new InputStreamReader(s.getInputStream()));
               
               
               //Ŀ��,socket���������д����д�뵽socket����������͸��ͻ���
               
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
    