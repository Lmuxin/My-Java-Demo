    /*
    IO�ļ�����д
    */
    
    import java.io.*;
    class IoDemo3
    { 
      public static void main(String[] args) 
        { 
        
     
        
         FileWriter fw=null;
        
            try
            {
              fw=new FileWriter("demo1.txt",true);   //����һ��true����,��ʾ�����������ļ�,���������ļ�ĩβ���������ݵ���д
            
               fw.write("abdcjjdfdhfjdfh\\ndhjhj");//    \\n  �ǻ���
          
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