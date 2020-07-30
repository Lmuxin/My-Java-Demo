    /*客户端通过键盘录入用户名
    服务端进行校验  
    若用户名存在,再服务端显示***已经登陆
    若该用户不存在 在服务端显示***尝试登陆
    并在客户端显示***该用户不存在
    最多登陆三次
    
    
    需要有自己的数据库保存用户名,可以自己建立一个txt文本存用户名
    */
    
    
   import  java.io.*;
    import java.net.*; 

       class  LoginClient
    {
        public static void main(String[] args) throws Exception
        {  
            
  
             Socket s=new Socket("192.169.1.255",10007);
             BufferedReader bufr=new BufferedReader (new InputStreamReader(System.in));//读键盘录入
                   PrintWriter out=new PrintWriter(s.getOutputStream(),true);
                   
                   
               BufferedReader bufin=new BufferedReader(new InputStreamReader(s.getInputStream()));//读服务端返回的数据
               
               
               for(int x=0;x<3;x++)
               
               {
                  String line=bufr.readLine();
                  if(line==null)
                  break;
                  out.println(line);
                  
                  String info=bufin.readLine();
                
                  System.out.println("info::"+info);
                  if(info.contains("欢迎"))
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
                    
                    BufferedReader  bufr=new BufferedReader(new FileReader("user.txt"));//用户名的文本
                    
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
                         
                          System.out.println(name+".登陆");  
                          out.println(name+",欢迎");  
                          break;                   
                         }
                       else
                       {
                         System.out.println(name+".尝试登陆");  
                          out.println(name+"用户名不存在");  
                          break;          
                       
                       
                       }
                   }
        
               
                  s.close();
                
            }
                 catch(Exception e)
                   {
                     throw new RuntimeException(ip+"校验失败");
                   }
        }
     
     }
     

    
       
    /*
       服务端  
    
    
    
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