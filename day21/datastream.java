       /*
      DataStream
      ���ڲ��������������Ͷ���
      
      DataInputStream
      DataOutputStream
       */
       
       import java.io.*;
       class Datestream
       {
          
          public static void main(String[] args)throws IOException
          {   
           writeData();
           readData();
          OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("utf.txt"),"utf-8");
          osw.write("������");
          osw.close();
          
           
          
          }
          
          public static void writeUTF()throws IOException
          {
          
          DataOutputStream dos=new  DataOutputStream(new FileOutputStream("UTF.txt"));
                dos.writeUTF("���");
                dos.close();
          
          }
          
          public static void readData()throws IOException
          {
            DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));
            
            int num=dis.readInt();
            boolean b=dis.readBoolean();
            double d=dis.readDouble();
            
            System.out.println(num);
              System.out.println(b);
                System.out.println(d);
                dis.close();
          
          }

          
          public static void writeData()throws IOException
          {
                DataOutputStream dos=new  DataOutputStream(new FileOutputStream("data.txt"));
                dos.writeInt(234);
                dos.writeBoolean(true);
                dos.writeDouble(787384.784);
                dos.close();
          }

  }