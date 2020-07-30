    /*
    IO文件的续写
    */
    
    import java.io.*;
    class IoDemo3
    { 
      public static void main(String[] args) 
        { 
        
     
        
         FileWriter fw=null;
        
            try
            {
              fw=new FileWriter("demo1.txt",true);   //传递一个true参数,表示不覆盖已有文件,并在已有文件末尾处进行数据的续写
            
               fw.write("abdcjjdfdhfjdfh\\ndhjhj");//    \\n  是换行
          
              fw.close();
            }
            
             catch(IOException e)
             {
               System.out.println(e.toString());
             }
             
             finally
             {
                 try
                 {
                     if(fw!=null)
                      fw.close();
                 }
                 
                 catch(IOException e)
                 {
                   System.out.println(e.toString());
                 }
              }
      
          }
     }