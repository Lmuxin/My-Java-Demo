    /*
    IO流异常处理方式
    */
    
    import java.io.*;
    class IoDemo2
    { 
      public static void main(String[] args) 
        { FileWriter fw=null;
        
            try
            {
              fw=new FileWriter("demo1.txt");//这三句话会有异常,比如说硬盘满了,写不了了,要try
            
               fw.write("abdcjjdfdhfjdfh");
          
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
                     if(fw!=null)//这句挺重要
                      fw.close();//无论有没有异常,这个一定要执行
                 }
                 
                 catch(IOException e)
                 {
                   System.out.println(e.toString());
                 }
              }
      
          }
     }