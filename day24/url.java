    /*
     URL   
     
     
     String getFile();//获取URL文件名
     String getHost(); 获取URL主机名
     String getPath();//获取URL路径部分
     String getPort(); 获取URL端口
     String getProtocol();//获取URL协议名称
     String getQuery(); 获取URL的查询部
    
    */
    

    
     import java.io.*;
      import java.net.*;
      
      class Myurl
      {
      
            public static void main(String[] args) throws Exception
            
              {
              
              
                 URL url=new URL ("http://169.254.89.44:8080/myweb/test.HTML?gefgfheg");
                 System.out.println("getProtocol()"+url.getProtocol());
                 System.out.println("getHost()"+url.getHost());
                 System.out.println("getPort()"+url.getPort());
                System.out.println("getPath()"+url.getPath());
                 System.out.println("getFile()"+url.getFile());
                System.out.println("getQuery()"+url.getQuery());
                
                
             /*   int port=getPort();
                if(port==-1)
                port=80;
                getPort==-1; 
                
                
                */
          
                              
              }
            
            
      
      
      }