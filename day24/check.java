    /*�ͻ���ͨ������¼���û���
    ����˽���У��  
    ���û�������,�ٷ������ʾ***�Ѿ���½
    �����û������� �ڷ������ʾ***���Ե�½
    ���ڿͻ�����ʾ***���û�������
    ����½����
    
    
    ��Ҫ���Լ������ݿⱣ���û���,�����Լ�����һ��txt�ı����û���
    */
    
    
   import  java.io.*;
    import java.net.*; 

       class  LoginClient
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
        class LoginServer
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             while(true)
             {
               Socket s=ss.accept();
              new Thread(new UserThread(s)).start();
              
              }
              
        }
 
    }