import java.io.*;
import java.net.*;

class myServer
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(11000);
             
            
               Socket s=ss.accept();
               
               
               System.out.println(s.getInetAddress().getHostAddress());
              
               
               PrintWriter out=new PrintWriter(s.getOutputStream(),true);
               
               out.println("¿Í»§¶ËÄãºÃ");
               
               s.close();
               ss.close();
 
        }
 
    }
    
    