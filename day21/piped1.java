       /*
       RandomAccessFile
       ��������ļ�,����߱���д����,ͨ��skipByte(int x),seek(int x)�ﵽ�������
       
       �ܵ���
       PipedInputStream
       PipedOutputStream
       �����������ֱ�ӽ�������,ͨ������߳�ʹ��
       */
       
       import java.io.*;
       class Read  implements Runnable
       {
           private PipedInputStream in;
           Read( PipedInputStream in)
           {
             this.in=in;
           }
         public void run()
         {
            try
            { 
               byte[] buf=new byte[1024];
               System.out.println("��ȡǰû�����ݾ�����");
               int len=in.read(buf);
               System.out.println("��������,��������");
               String s=new String(buf,0,len);
           System.out.println(s);
               in.close();
            
            }
            catch(IOException e)
            {
              throw new RuntimeException("�ܵ���ȡ��ʧ��");
            
            }
            
         }
       
       }
       
       
           class Write  implements Runnable
       {
           private PipedOutputStream out;
           Write( PipedOutputStream out)
           {
             this.out=out;
           }
         public void run()
         {
            try
            {  System.out.printlb("��ʼд������,�ȴ�6���");
              Thread.sleep(600);
            
             out.write("piped lailai".getBytes());
             out.close();
            
            }
            
              catch(IOException e)
            {
              throw new RuntimeException("�ܵ�д����ʧ��");
            
            }
         }
       
       }
       

       
       class Piped
       {    
       public static void main(String[] args)throws IOException
          {   
          
            PipedInputStream in=new PipedInputStream();
            PipedOutputStream out=new PipedOutputStream();
           Read r=new Read(in);
           Write w=new Write(out);
           new Thread(r).start();
           new Thread(w).start();
          }
 
  }