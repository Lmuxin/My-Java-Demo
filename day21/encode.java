      /*
            ����� 
       
            
          ����:�ַ������ֽ�����  String -->byte[]   str.Bytes(charsetName);
          ����:�ֽ�������ַ���  byte[]-->String   new String(byte[],charsetName);
  
      
       */
       
       import java.util.*;
       class Encode
       {
          
          public static void main(String[] args)throws Exception
          {   
           String s=("���");
           
          byte[] b1= s.getBytes("GBK");//����
          System.out.println(Arrays.toString(b1));   
          String s1=new String(b1,"iso8859-1");
         
           System.out.println(s1);
          
          
          //��s1����iso8859-1����
          byte[] b2= s1.getBytes("iso8859-1");//����һ��
          
          System.out.println(Arrays.toString(b2));   
          String s2=new String(b2,"GBK");//����һ�� 
          
          
          //����һ��,����һ�� ���Ա�������
          
          System.out.println(s2);
           
          
          }
        }