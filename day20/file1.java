             /*
             File可以操作文件也可以操作文件夹  
               
             */
  
             import  java.io.*;
             
             class FileDemo
             {
             
                     public static void main(String[] args)
                     {
                        conMethod();
                    
                     }
                   
                           //创建File对象

                   public static void conMethod()
                   {
                     //将a.txt封装成file对象,可以将已有的和未出现的文件或者文件夹放封装成对象
                     File f1=new File("a.txt");
                    
                    //
                   
                   
                     File f2=new File("C:\\ABC","b/txt");//ABC是目录,b.txt是目录下的文件
                     
                       File d=new File("c:\\abc");
                        File d=new File("c:"+File.separator+"abc");//目录分隔符和上一句一样
                       File f3=new File(d,"c.txt");
                       
                       sop(f1);
                       
                       sop(f2);
                           sop(f3);
                   }
  
                   public static void sop(Object obj)
                   {
                      System.out.println(obj);
                   }
             }