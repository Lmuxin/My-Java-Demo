   /*

   ����:  ��һ���ļ����ݴ�ӡ�ڿ���̨\
   Դ:�ļ�
   Ŀ��: ����̨

 ���������� :
   
   ���ѡ�����ĸ�������?
   
   ͨ��������ȷ������
   
   1.��ȷԴ��Ŀ�� 
      Դ: ������  InputStream  Reader
      Ŀ��:�����  OutputStream  Writer
    2. �����������Ƿ��Ǵ��ı�
       ��:�ַ��� 
       ��:�ֽ���
     3.����ϵ��ȷ��,����ȷҪʹ���ĸ��������
        ͨ���豸����������:
        Դ�豸: �ڴ�  Ӳ��  ����
        Ŀ���豸:�ڴ� Ӳ��  ����̨
        
        
     case  1  ��һ���ı��ļ��е����ݴ洢����һ���ļ���  �����ļ�
               Դ:��Ϊ��Դ,����ʹ�ö�ȡ��InputStream  Reader
                  �ǲ����ı��ļ�   ѡ��Reader
                  ��������ȷ����ϵ
                  ��������ȷҪʹ�ø���ϵ�е��ĸ�����
                  ��ȷ�豸:Ӳ��,�ϵ�һ���ļ�
                  Reader��ϵ�п��Բ����ļ��Ķ�����FileReader
                  
                  �Ƿ����Ч��?
                  �� :����Reader��ϵ�еĻ�����BufferedReader
                  FileReader fr=new FileReader("r.txt);
                  BufferedReader bufr=new BufferedReader(fr);
                  
                  
               Ŀ��: OutputStream Writer
                   �Ǵ��ı�  Writer
                   �豸:Ӳ�� ,һ���ļ� 
                   Writer���Բ����ı��ļ��Ķ�����FileWriter
                   �Ƿ����Ч��?
                  �� :����Writer��ϵ�еĻ�����BufferedWriter
     FileWriter fw=new FileWriter("w.txt");
     BufferedWriter  bufw=new BufferedWriter(fw);
     
     -----------------------------------------------
     
     case 2  ������¼������ݱ��浽һ���ļ���
             Դ:InputStream  Reader
             �Ǵ��ı�:  ѡ��Reader
             �豸:���� ��Ӧ�Ķ�����System.in,Ϊ�˲��������ı����ݷ���,ת���ַ��������ַ����������
             ��Ȼ��ȷ��Reader,�ͽ�System.inת����Reader,��Reader ��ϵ�е�InputStreamReader
              InputStreamReader isr=new InputStreamReader(System.in);
            �Ƿ����Ч��?
                  �� :BufferedReader
                  BufferedReader bufr=new BufferedReader(isr);
                  
                 Ŀ��: OutputStream Writer
                   �Ǵ��ı�  Writer
                   �豸:Ӳ�� ,һ���ļ�,ʹ��FileWriter
                    FileWriter fw=new FileWriter("w.txt");
                     �Ƿ����Ч��?
                  �� :BufferedWriter
                  BufferedWriter bufw=new BufferedWriter(fw);
                  
                 ��չһ��:��Ҫ��¼������ݰ���ָ���ı����浽�ļ���
                 Ŀ��: OutputStream Writer
                   �Ǵ��ı�  Writer
                   �豸:Ӳ�� ,һ���ļ�,ʹ��FileWriter
                   ����FileWriter��ʹ�õ�Ĭ�ϱ����  GBK
                   
                   ���Ǵ洢ʱ,��Ҫ����ָ�������UTF-8,��ָ���ı����ֻ��ת��������ָ��
                   ����Ҫʹ��OutputStreamWriter
                   ����ת����������Ҫ����һ���ֽ������,���һ����Բ������ļ����ֽ��� FileOutputStream
                    FileWriter fw=new FileWriter("w.txt");
                     
                  OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("d.txt"),"UTF-8");
        
               �Ƿ����Ч��?
                  �� :BufferedWriter
            BufferedWriter bufw=new BufferedWriter(osw);
         
         ����ת����ʲôʱ��ʹ��?�ַ����ֽڵ�����,ͨ��,�漰���ַ�����ת��ʱ,��Ҫ�õ�.
         
         
         
         
   */
   import java.io.*;
    class Readin2
    {
       public static void main(String[] args)throws IOException 
       {
       
        System..setIn(new FileInputStream("guilv.java" ));//����ԴΪһ���ļ�
         System..setOut(new PrintStream("zz.txt" ));//����Ŀ��Ϊһ���ļ�,guilv.java������ݱ��浽zz.txt��
       
       
       
       
       
         //��ȡ����¼�����
         
        
         BufferedReader bufr=new BufferedReader(new InputStreamReader(new FileInputStream("systemin.java")));

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
