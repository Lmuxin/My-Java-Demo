             /*
         File  类的常见方法
             创建
             boolean createNewFile();//在指定位置创建文件 ,若文件已经存在,则不创建,返回false,和输出流不一样,输出流对象已创建文件,而文件存在事会被覆盖
             
             删除
             boolean delete();//删除失败返回假
             void deleteOnExit();//程序退出时删除指定文件
             
             判断
             boolean canExecute();//判断文件是否可执行
             boolean existe();//文件是否存在
             boolean mkdir();//创建单极文件夹
              boolean mkdirs();//创建多极文件夹
              boolean isDirectory();//是否是目录
              boolean  isFile(0;//是否是文件
              boolean isHidden();//是否是一个隐藏文件
             boolean  isAbsolute();//是否是绝对路径
             
             获取信息
             String  getName();//文件名字
             getPath();//相对路径
             getParent();//该方法返回绝对路径中的文件父目录,若获取相对路径,返回null,若果相对路径中有上一层目录,那么该目录就是返回结果比如  "abgd\\f.txt",返回abgf
             getAbsolutePath();//绝对路径
           long  getLatModified();//最后一次修改的时间
            long  length();//返回路径长度 
             boolean renameTo();//重命名

               
             */
  
             import  java.io.*; 
             
             class FileDemo2
             {
             
                     public static void main(String[] args)throws IOException
                     {
                        conMethod();
                        method_1();
                           method_2();
                            method_4();
                    
                     }
                     
                     
                      public static void methoed_5()
                     {
                       File f1=new File("C:\\sd.txt");
                       File f2=new File("C:\\hahah.txt");
                       
                       sop(f.renameTo(f2));//重命名
                     
                     }
                     
                      public static void methoed_4()
                     {
                       File f=new File("C:\\sd.txt");
                       sop(f.getPath());
                       sop(f.getAbsolutePath());
                       sop(f.getParent());
  
                     }
                     
                     
                     
                     
                     public static void methoed_1()
                     {
                       File f=new File("file.txt");
                       sop(f.createNewfile());
                       
                       
                       sop(f.delete());
                       f.deleteOnExit();//退出时删除
                     
                     }
                     
                     
                     
                   public  static void method_2()
                   {
                     File f=new File("file.txt");
                     sop(f.canExecute());
                     sop(f.exists());
                     
                     
                     //创建文件夹
                     
                     File dir=new File("abc");//放在当前目录下
                    sop( dir.mkdir());//输出是否创建成功,true 或者false,注意mkdir只能创建单级目录
                     
                   
                   }  

                     public  static void method_3()throws IOException
                   {
                     File f=new File("file.txt");
                    
                    
                    //在判断是否是文件或者文件夹时,必须要先判断文件归乡封装的内容是否存在
                    //通过exists判断
                    sop(f.isDirectory());//false
                    sop(f,isFile());//false    file.txt根本不存在
                    
                    
                    
                    sop(f.isAbsolute());//判断是否是绝对路径,带着盘符
                    
                    
                    
                    
                    
                    
                    
                   
                   }  

                          
                       
                       
                          
                   public static void sop(Object obj)
                   {
                      System.out.println(obj);
                   }
             }