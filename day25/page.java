       /*
      
       ��ҳ���� (֩��)
  
       */
           
 
         import java.util.regex.*; 
         
         import java.io.*; 
           
           class page
         {
             public static void main(String[] args)throws IOException
             {
           
                
              
                 
             }
             
             /*
             
             ��ȡָ���ĵ��е��ʼ���ַ,ʹ�û�ȡ����
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
          
          
          