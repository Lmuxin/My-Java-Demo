    /*
     URL   
     
     
     String getFile();//��ȡURL�ļ���
     String getHost(); ��ȡURL������
     String getPath();//��ȡURL·������
     String getPort(); ��ȡURL�˿�
     String getProtocol();//��ȡURLЭ������
     String getQuery(); ��ȡURL�Ĳ�ѯ��
    
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