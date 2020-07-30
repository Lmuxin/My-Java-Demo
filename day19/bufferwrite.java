  /*
  字节流的缓冲区
  BufferedOutputStream
  BufferedInputStream
  */
  
  import java.io.*;
  class buffer
  {
  public static void main(String[] args)throws IOException
    { long start=System.currentTimeMillis();
      copy();
      long end=System.currentTimeMillis();
      System.out.println(end-start);
    
      }
   public static void copy()throws IOException
     {
       BufferedInputStream bufis=new BufferedInputStream(new FileInputStream("c:\\0.MP3"));
       BufferedOutputStream bufos=new BufferedOutputStream(new FileOutputStream("c:\\1.MP3"));
       
       int by=0;
       while((by=bufis.read())!=-1) 
         {
         bufos.write(by);
         
         }
     
     
       }  
  
  }