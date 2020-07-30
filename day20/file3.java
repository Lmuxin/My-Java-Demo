    /*
      File  listRoots();//列出电脑里有效的盘符
     File list();//打印指定目录下所以文件或者文件夹名称,包含隐藏文件,调用list方法的file对象必须封装了一个目录,该目录必须存在
     
   */
  
             import  java.io.*; 
             
             class ListRoots 
             {
             
                     public static void main(String[] args)throws IOException
                     {
                       File  dir=new File("c"\\");
                     File [] files=  dir.listFiles();
                       for(File f:files)
                       {
                          sop(f.getName+"....."+f.length());
                          
                       }
                       
                     }
                     
             
                     public static  void list1()
                     {
                      
                        File dir=new File("d:\\java\\day20")
                        String [] arr=dir.list(new FilenameFilter()
                        {
                        public boolean accept(Filr dir,String name)
                          {
                         
                             return name.endsWith(".bmp");//过滤出来以.bmp结尾命名的文件夹
                          }
                        });
                        System.out.println(arr.length);
                        
                        for(String name: arr)
                          {
                          
                          sop(name);
                          }
                        
                     }                 
                      public static void listRoots2()
                     {
                       
                       
                       File f=new File("c:\\");
                       String [] names=f.list();//打印指定目录下所以文件或者文件夹名称,包含隐藏文件
                                                  //调用list方法的file对象必须封装了一个目录,该目录必须存在
                       for(String name :names)
                       sop(name);
                     
                     }
       
                     
                      public static void listRoots()
                     {
                       
                       
                       
                       File[] files=new File.listRoots();//列出电脑里有小的盘符
                       for(File f:files)
                       sop(f);//重命名
                     
                     }
       
                   public static void sop(Object obj)
                   {
                      System.out.println(obj);
                   }
             }