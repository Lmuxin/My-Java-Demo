  /*
通过缓冲区复制一个java文件

readLine()方法返回时,只返回回车符前面的数据内容,并不返回回车符
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
                throw new RuntimeException("读写失败");
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
               throw new RuntimeException("读取关闭失败");
              
              }
          
          try
            {
            if(bufw!=null)
            bufw.close();          
            }
            
          
          catch(Exception e)
          {
           throw new RuntimeException("写入关闭失败");
          
          }
     
         
        
        }
    
    }
    }