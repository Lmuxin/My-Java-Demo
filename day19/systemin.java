   /*
  �ֽ���תΪ�ַ���  ��ȡת����
   
   */
   import java.io.*;
    class Readin
    {
       public static void main(String[] args)throws IOException 
       {
         //��ȡ����¼�����
         
         InputStream  in=System.in;
         //���ֽ�������ת���ַ�������,ʹ��ת�� ��,InputStreamReader
         InputStreamReader isr=new InputStreamReader(in);
         
         //Ϊ�����Ч��,���ַ������л�����������Ч����,ʹ��BufferedReader
         
         BufferedReader bufr=new BufferedReader(isr);
         
         String line=null;
         
         while((line=bufr.readLine())!=null)
           { if("over".equals(line)//y����overֹͣ
           return;
            System.out.println(line.toUpperCase());
           }
         bufr.close();
          
       }

    }