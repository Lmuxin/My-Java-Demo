       /*
       RandomAccessFile
       ��������ļ�,����߱���д����,ͨ��skipByte(int x),seek(int x)�ﵽ�������
       
       ���಻����Io��ϵ�е�����,����ֱ�Ӽ̳�Object��,��������IO����ĳ�Ա,��Ϊ�����ж���д�Ĺ���,�ڲ���װ��һ������,ͨ��ָ��������Ԫ�ؽ��в���,����ͨ��getFilePointer��ȡָ��λ��,Ҳ����ͨ��seek�ı�ָ��λ��
       
      ��ʵ��ɶ�д��ԭ�����ڲ���װ���ֽ��������������
      ͨ�����캯�����Կ�������ֻ�ܲ����ļ�
      �����ļ�����ģʽ  r...ֻ��    rw...��д
      ���ģʽ��ֻ��,���ᴴ���ļ�,��ȥ��ȡһ���Ѵ��ڵ��ļ�,���ļ�������,�ᱨ�쳣
      ��ģʽΪrw,�ö���Ĺ��캯��Ҫ�������ļ������ڻ��Զ�����,�������򲻻Ḳ��
      
       */
       
       import java.io.*;
       class Random
       {
          
       public static void main(String[] args)throws IOException
          {   
          
            writeFile();
             writeFile_1();
              writeFile2();
         
          }
          
          
          public static void readFile()throws IOException
      {
         RandomAccessFile raf=new RandomAccessFile("ran.txt","r");//rֻ��,����д
         
         //���ö����е�ָ��
         raf.seek(8);//ָ��ָ��ű�8
         //����ָ�����ֽ���
         raf.skipBytes(8);//����������
         byte[] buf=new byte[4];
         raf.read(buf);
         String s=new String(buf);
         int age=raf.readInt();
         System.out.println(name);
            System.out.println(age);
         raf.close();
         
      
      }
      
      public static void writeFile2()throws IOException
      {
         RandomAccessFile raf=new RandomAccessFile("ran.txt","rw");
         raf.seek(8*3);
         raf.write("����".getBytes());
         raf.write(103);
      
      }
          
          
          
      public static void writeFile_1()throws IOException
      {
         RandomAccessFile raf=new RandomAccessFile("ran.txt","rw");
         
         raf.write("����".getBytes());
         raf.writeInt(98);
         raf.close();
      
      }
  }