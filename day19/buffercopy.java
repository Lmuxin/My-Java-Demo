  /*
ͨ������������һ��java�ļ�

readLine()��������ʱ,ֻ���ػس���ǰ�����������,�������ػس���
  */
  
  
   import  java.io.*;
    class bufferCopy
    {
    
        public static void main(String[] args)throws IOException
        {
          
            
          
                BufferedReader bufr=null;
                BufferedWriter bufw=null;
                
                try 
                {
                    bufr=new BufferedReader(new FileReader("buffer.java"));
                    bufw=new BufferedWriter(new FileWriter("buffwriter.txt"));
                    
                       
                   String line =null;
                     while((line=bufr.readLine())!=null)
                     {
                          bufw.write(line);
                          bufw.newLine();
                          bufw.flush();
                          
                  
                      }
                }
                
                
             catch(Exception e)
             {
                throw new RuntimeException("��дʧ��");
             }
          
          
          finally
          {

            try
              {
              if(bufr!=null)
              bufr.close();

              }
          
          catch(Exception e)
              {
               throw new RuntimeException("��ȡ�ر�ʧ��");
              
              }
          
          try
            {
            if(bufw!=null)
            bufw.close();          
            }
            
          
          catch(Exception e)
          {
           throw new RuntimeException("д��ر�ʧ��");
          
          }
     
         
        
        }
    
    }
    }