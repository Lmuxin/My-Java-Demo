   /*

   需求:  把一个文件数据打印在控制台\
   源:文件
   目的: 控制台

 流操作规律 :
   
   如何选择用哪个流对象?
   
   通过三个明确来决定
   
   1.明确源和目的 
      源: 输入流  InputStream  Reader
      目的:输出流  OutputStream  Writer
    2. 操作的数据是否是纯文本
       是:字符流 
       否:字节流
     3.当体系明确后,再明确要使用哪个具体对象
        通过设备来进行区分:
        源设备: 内存  硬盘  键盘
        目的设备:内存 硬盘  控制台
        
        
     case  1  将一个文本文件中的数据存储到另一个文件中  复制文件
               源:因为是源,所以使用读取流InputStream  Reader
                  是操作文本文件   选择Reader
                  这样就明确了体系
                  接下来明确要使用该体系中的哪个对象
                  明确设备:硬盘,上的一个文件
                  Reader体系中可以操作文件的对象是FileReader
                  
                  是否提高效率?
                  是 :加入Reader体系中的缓冲区BufferedReader
                  FileReader fr=new FileReader("r.txt);
                  BufferedReader bufr=new BufferedReader(fr);
                  
                  
               目的: OutputStream Writer
                   是纯文本  Writer
                   设备:硬盘 ,一个文件 
                   Writer可以操作文本文件的对象是FileWriter
                   是否提高效率?
                  是 :加入Writer体系中的缓冲区BufferedWriter
     FileWriter fw=new FileWriter("w.txt");
     BufferedWriter  bufw=new BufferedWriter(fw);
     
     -----------------------------------------------
     
     case 2  将键盘录入的数据保存到一个文件中
             源:InputStream  Reader
             是纯文本:  选择Reader
             设备:键盘 对应的对象是System.in,为了操作键盘文本数据方便,转成字符流按照字符串操作最方便
             既然明确了Reader,就将System.in转换成Reader,用Reader 体系中的InputStreamReader
              InputStreamReader isr=new InputStreamReader(System.in);
            是否提高效率?
                  是 :BufferedReader
                  BufferedReader bufr=new BufferedReader(isr);
                  
                 目的: OutputStream Writer
                   是纯文本  Writer
                   设备:硬盘 ,一个文件,使用FileWriter
                    FileWriter fw=new FileWriter("w.txt");
                     是否提高效率?
                  是 :BufferedWriter
                  BufferedWriter bufw=new BufferedWriter(fw);
                  
                 扩展一下:想要把录入的数据按照指定的编码表存到文件中
                 目的: OutputStream Writer
                   是纯文本  Writer
                   设备:硬盘 ,一个文件,使用FileWriter
                   但是FileWriter是使用的默认编码表  GBK
                   
                   但是存储时,需要加入指定编码表UTF-8,而指定的编码表只有转换流可以指定
                   所以要使用OutputStreamWriter
                   而该转换流对象需要接收一个字节输出流,而且还可以操作的文件的字节流 FileOutputStream
                    FileWriter fw=new FileWriter("w.txt");
                     
                  OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("d.txt"),"UTF-8");
        
               是否提高效率?
                  是 :BufferedWriter
            BufferedWriter bufw=new BufferedWriter(osw);
         
         所以转换流什么时候使用?字符和字节的桥梁,通常,涉及到字符编码转换时,需要用到.
         
         
         
         
   */
   import java.io.*;
    class Readin2
    {
       public static void main(String[] args)throws IOException 
       {
       
        System..setIn(new FileInputStream("guilv.java" ));//设置源为一个文件
         System..setOut(new PrintStream("zz.txt" ));//设置目的为一个文件,guilv.java里的内容保存到zz.txt里
       
       
       
       
       
         //获取键盘录入对象
         
        
         BufferedReader bufr=new BufferedReader(new InputStreamReader(new FileInputStream("systemin.java")));

          BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));
         
         
         String line=null;
         
         while((line=bufr.readLine())!=null)
           { if("over".equals(line))//y遇到over停止
         break;
           bufw.write(line.toUpperCase());
             bufw.newLine();
             
           bufw.flush();
           }
         bufr.close();
          
       }
