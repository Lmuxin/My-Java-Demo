   /*
   
   �쳣����־��Ϣ
   
   */
     import java.io.*;
     import java.util.*;
          import java.text.*;
     class ExceptionDemo
     {
     
         public static void main(String[] args) throws IOException
         {
          try
            {
            int[] arr=new int[2];
            System.out.println(arr[3]);
            } 
         catch(Exception e)
         {
              try
              {
              
              Date d=new Date();
              
              SimpleDateFormat sdf=new  SimpleDateFormat("yyy-MM--dd  hh:mm:ss");
              String s= sdf.format(d);
             PrintStream ps=new PrintStream("execption.log");
             ps.println(d.toString());
              System.setOut(ps);
              
              }        
         
               catch(IOException ex)
               {
               throw new RuntimeException("��־�ļ�����ʧ��");
               
               }
            e.printStackTrace(System.out);
          
           }
 
         }
     
     
     }