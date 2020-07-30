       /*
       RandomAccessFile
       随机访问文件,自身具备读写方法,通过skipByte(int x),seek(int x)达到随机访问
       
       该类不算是Io体系中的子类,而是直接继承Object类,但是他是IO包里的成员,因为他具有读和写的功能,内部封装了一个数组,通过指针对数组的元素进行操作,可以通过getFilePointer获取指针位置,也可以通过seek改变指针位置
       
      其实完成读写的原理是内部封装了字节输入流和输出流
      通过构造函数可以看出该类只能操作文件
      操作文件还有模式  r...只读    rw...读写
      如果模式是只读,不会创建文件,会去读取一个已存在的文件,若文件不存在,会报异常
      若模式为rw,该对象的构造函数要操作的文件不存在会自动创建,若存在则不会覆盖
      
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
         RandomAccessFile raf=new RandomAccessFile("ran.txt","r");//r只读,不能写
         
         //调用对象中的指针
         raf.seek(8);//指针指向脚标8
         //跳过指定的字节数
         raf.skipBytes(8);//不能往回走
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
         raf.write("周期".getBytes());
         raf.write(103);
      
      }
          
          
          
      public static void writeFile_1()throws IOException
      {
         RandomAccessFile raf=new RandomAccessFile("ran.txt","rw");
         
         raf.write("李四".getBytes());
         raf.writeInt(98);
         raf.close();
      
      }
  }