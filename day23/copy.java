  /*
     ���� :TCP�����ļ�
   
     
     */
     
     
           //�ͻ���
         import java.net.*; 
         import java.io.*; 
   
       class   Client3
    {
        public static void main(String[] args)throws Exception
        {  
            
             Socket s=new Socket("192.169.1.255",10000);
  
             BufferedReader bufr=new BufferedReader(new FileReader("ip.java"));
             
              PrintWriter out=new PrintWriter(s.getOutputStream(),true);
              
              
              //DataOutputStream dos=new DataOutputStream(s,getOutputStream()); 
             // long time=System.currentTimeMillis();
              //
             // out.println(time);
            // dos.writeLong(time);
      
             String line=null;
             while((line=bufr.readLine())!=null)
             {

               out.println(line);
                            
             }
             s.shutdownOutput();//�رտͻ��������,�൱�ڸ����м���һ��������־
           //  dos.writeLong(time);
             
            // System.out.println("over");
          BufferedReader bufin=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str=bufin.readLine();
            System.out.println(str);
            
              bufr.close();
              s.close();
        }

    }     
    /*�����  
    Դ:socket��ȡ��
    Ŀ��;socket�����
    �����ı� װ��һ��
    
    
    */
        class Server4
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             
               Socket s=ss.accept();
               
               String ip=s.getInetAddress().getHostAddress();
               System.out.println(ip+".....connected");
               
               
              // DataInputStream dis=new DataInputStream(s.getInputStream());
               //long l=dis.readLong();
               
               
     
               BufferedReader bufin=new BufferedReader(new InputStreamReader(s.getInputStream()));
               
              
                PrintWriter out=new PrintWriter(new FileWriter("server.txt"),true);
              
               
               
               String line=null;
               while((line=bufin.readLine())!=null)
               { 
               
              // if("over".equals(line))
               //break;
                  out.println(line);
      
               }
               
               PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
               pw.println("�ϴ��ɹ�");
               out.close();
                s.close();
               ss.close();
      
        }
 
    }