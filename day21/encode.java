      /*
            编码表 
       
            
          编码:字符串变字节数组  String -->byte[]   str.Bytes(charsetName);
          解码:字节数组变字符串  byte[]-->String   new String(byte[],charsetName);
  
      
       */
       
       import java.util.*;
       class Encode
       {
          
          public static void main(String[] args)throws Exception
          {   
           String s=("你好");
           
          byte[] b1= s.getBytes("GBK");//编码
          System.out.println(Arrays.toString(b1));   
          String s1=new String(b1,"iso8859-1");
         
           System.out.println(s1);
          
          
          //对s1进行iso8859-1编码
          byte[] b2= s1.getBytes("iso8859-1");//编码一次
          
          System.out.println(Arrays.toString(b2));   
          String s2=new String(b2,"GBK");//解码一次 
          
          
          //编码一次,解码一次 可以避免乱码
          
          System.out.println(s2);
           
          
          }
        }