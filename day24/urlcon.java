/*

  URLConnection
  
  */  

    
     import java.io.*;
      import java.net.*;
      
      class Urlcon
      {
      
            public static void main(String[] args) throws Exception
            
              {
              
              
                 URL url=new URL ("http://169.254.89.44:8080/myweb/test.HTML");
               URLConnection conn=url.openConnection();

                 System.out.println(conn);
                 
                 
                 
                 InputStream in=conn.getInputStream();
                 byte[] buf=new byte[1024];
                 int len=in.read(buf);
                 
                    System.out.println(new String(buf,0,len));
                              
              }
   
      }