 /*
   �ͻ�������� 
   ������Զ���
   
   
   1.�ͻ���  �����(telnet)
     ����� �Զ���
     
   2.�ͻ���  �����
     �����   Tomcat������
    */ 
    
    
   import  java.io.*;
    import java.net.*; 

       class ClientDemo
    {
        public static void main(String[] args) throws Exception
        {  
            
  
             Socket s=new Socket("192.169.1.255",10007);
             BufferedReader bufr=new BufferedReader (new InputStreamReader(System.in));//������¼��
                   PrintWriter out=new PrintWriter(s.getOutputStream(),true);
                   
                   
               BufferedReader bufin=new BufferedReader(new InputStreamReader(s.getInputStream()));//������˷��ص�����
               
               
               for(int x=0;x<3;x++)
               
               {
                  String line=bufr.readLine();
                  if(line==null)
                  break;
                  out.println(line);
                  
                  String info=bufin.readLine();
                
                  System.out.println("info::"+info);
                  if(info.contains("��ӭ"))
                    break;
               }   
                   
                
            bufr.close();
              s.close();
        }

    }  
 
    
     class UserThread implements Runnable
     {
     
        private Socket  s;
      UserThread(Socket s)
        {
           this.s=s;
  
        }
        
        
        public void run()
        {
        
           
             String ip=s.getInetAddress().getHostAddress();
          try 
            { 
            
                 for(int x=0;x<3;x++)
                 {
                   BufferedReader bufin=new BufferedReader(new InputStreamReader(s.getInputStream()));
                   
                    String name=bufin.readLine();
                    if(name==null)
                    break;
                    
                    BufferedReader  bufr=new BufferedReader(new FileReader("user.txt"));//�û������ı�
                    
                   PrintWriter out=new PrintWriter(s.getOutputStream(),true);
                   
                      String line=null;
                      
                      boolean flag=false;
                       while((line=bufr.readLine())!=null)
                       {  if(line.equals(name))
                             {
                             flag=true;
                             break;
                             
                             }
                       }
                       
                         if(flag)
                         {
                         
                          System.out.println(name+".��½");  
                          out.println(name+",��ӭ");  
                          break;                   
                         }
                       else
                       {
                         System.out.println(name+".���Ե�½");  
                          out.println(name+"�û���������");  
                          break;          
                       
                       
                       }
                   }
        
               
                  s.close();
                
            }
                 catch(Exception e)
                   {
                     throw new RuntimeException(ip+"У��ʧ��");
                   }
        }
     
     }
     

    
       
    /*
       �����  
    
    
    
    */
        class ServerDemo
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(11000);
             
            
               Socket s=ss.accept();
               System.out.println(s.getInetAddress().getHostAddress());
               InputStream in=s.getInputStream();
               byte[] buf=new byte[1024];
               int len=in.read(buf);
               System.out.println(new String(buf,0,len));
               
               
               
               
               PrintWriter out=new PrintWriter(s.getOutputStream(),true);
               
               out.println("�ͻ������");
               
               s.close();
               ss.close();
 
        }
 
    }
    
    
    
     
    
    
    
    
   /* 
    �������������˵���Ϣ
    http��������Ϣͷ
    
   GET /myweb/test.HTML HTTP/1.1
    Host: 169.254.89.44:10000
    User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36
    Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
    Accept-Encoding: gzip, deflate
    Accept-Language: zh-CN,zh;q=0.8,en;q=0.6,zh-TW;q=0.4
    Proxy-Connection: keep-alive
    Upgrade-Insecure-Requests: 1
    X-Lantern-Version: 3.7.4
        

    
    
    */