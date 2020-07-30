       /*
      
       网页爬虫 (蜘蛛)
  
       */
           
 
         import java.util.regex.*; 
         
         import java.io.*; 
           
           class page
         {
             public static void main(String[] args)throws IOException
             {
           
                
              
                 
             }
             
             /*
             
             获取指定文档中的邮件地址,使用获取功能
             Pattern Matcher
             
             */
             public static void getMail()throws IOException
             {
                BufferedReader bufr=
                new BufferedReader(new FileReader("mail.txt"));
                
                String line=null;
                
                String reg="\\w+@\\w+(\\.\\w+)+";
                Pttern p=Pattern.compile(reg);
                
                
                
                while((line=bufr.readLine())!=null)
                {
                
                      Matcher m= p.natche(line);
                       while(m.find())
                         {
                           System.out.println(line);
                         }

                }
             
             }
               
        
         }
          
          
          