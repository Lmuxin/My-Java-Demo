    /*
    IO���쳣����ʽ
    */
    
    import java.io.*;
    class IoDemo2
    { 
      public static void main(String[] args) 
        { FileWriter fw=null;
        
            try
            {
              fw=new FileWriter("demo1.txt");//�����仰�����쳣,����˵Ӳ������,д������,Ҫtry
            
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
                     if(fw!=null)//���ͦ��Ҫ
                      fw.close();//������û���쳣,���һ��Ҫִ��
                 }
                 
                 catch(IOException e)
                 {
                   System.out.println(e.toString());
                 }
              }
      
          }
     }