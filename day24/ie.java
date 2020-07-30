      import java.io.*;
      import java.net.*;
      
      class MyIe
      {
      
            public static void main(String[] args) throws Exception
            
              {
              
              
                  Socket s=new Socket("169.254.89.44",8080);
                  
                  PrintWriter out=new PrintWriter(s.getOutputStream(),true);
                
                  out.println("GET/myweb/test.HTML HTTP/1.1");
                  out.println("aCCEPT:,,..,");
                  out.println("Accept langeage;zh_cn");
                  
                  
                  
                  out.println();
                  
                  out.println();
                  
                BufferedReader bufr=new BufferedReader(new InputStreamReader(s.getInputStream()));
                String line=null;
                  while((line=bufr.readLine())!=null)
                    {
                    System.out.println(line);
                    
                    }
              
              s.close();
              
              }
            
            
      
      
      }