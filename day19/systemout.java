         /*
  �ַ���תΪ�ֽ���  ��ȡת����
   
   */
   import java.io.*;
    class Readin
    {
       public static void main(String[] args)throws IOException 
       {
         //��ȡ����¼�����
         
         /*InputStream  in=System.in;
         //���ֽ�������ת���ַ�������,ʹ��ת�� ��,InputStreamReader
         InputStreamReader isr=new InputStreamReader(in);
         
         //Ϊ�����Ч��,���ַ������л�����������Ч����,ʹ��BufferedReader
         
         BufferedReader bufr=new BufferedReader(isr);
         */
         
         //�������仰�����ۺ�Ϊһ��    �ַ�ת�ֽ�
         
         BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
         
      
      
         /*����ͬ��  �ֽ�ת�ַ�

         OutputStream out=System.out;
         OutputStreamWriter osw=new OutputStreamWriter(out);
         BufferedWriter bufw=new BufferedWriter(osw);
         */
         
         
    BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));
         
         
         String line=null;
         
         while((line=bufr.readLine())!=null)
           { if("over".equals(line))//y����overֹͣ
         break;
           bufw.write(line.toUpperCase());
             bufw.newLine();
             
           bufw.flush();
           }
         bufr.close();
          
       }

    }