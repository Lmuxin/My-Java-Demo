       /*
      ���ڲ����ֽ������������ 
      ByteArrayInputStream �ڹ����ʱ��,��Ҫ��������Դ,��������Դ��һ���ֽ�����
      ByteArrayOutputStream  �ڹ����ʱ��,���ö�������Ŀ��,��Ϊ�ö������Ѿ��ڲ���װ�˿ɱ䳤�ȵ��ֽ�����,���������Ŀ�ĵ�
      
      ��Ϊ�����������󶼲�������,��û��ʹ����Դ����,���þ���close�ر�
      
      ���������ɽ���ʱ
      Դ�豸:
             ���� System.in   Ӳ��FileStream   �ڴ� ArrayStream
      Ŀ���豸
            ����̨ System.out  Ӳ��FileStream   �ڴ� ArrayStream 
            
            
            
      
       */
       
       import java.io.*;
       class Bytearray
       {
          
          public static void main(String[] args)throws IOException
          {   
         //����Դ
         ByteArrayInputStream  bis=new ByteArrayInputStream("hudfhdh".getBytes());
         //Ŀ�ĵ�
         ByteArrayOutputStream bos=new ByteArrayOutputStream();
         
         int by=0;
         while((by=bis.read())!=-1)
         {
         
         bos.write(by);
         }
   
         System.out.println(bos.size());
    
          }
          
         

  }