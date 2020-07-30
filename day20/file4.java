/*
      列出指定目录下文件或者文件夹 包含子目录中的内容   递归
      因为目录中还有目录.只需要使用同一个列出目录功能的函数即可,在列出过程中出现的如果还是目录的话,还可以再次调用本功能 也就是函数自身调用自身,叫递归
      递归要注意  
      1.限定条件
      2.要注意递归的次数,尽量避免内存溢出
     
   */
  
             import  java.io.*; 
             
             class Listdemo3
             {
             
                     public static void main(String[] args)throws IOException
                     {
                       File dir=new File("d:\\java");
                       show(dir);
                       
                     }
                     
             
                     public static  void show(File dir)
                     {
                        sop(dir);
                        File[] files=dir.listFiles();
                        for(int x=0;x<files.length;x++)
                        {
                        
                        if(files[x].isDirectory())
                        show(files[x]);
                        else
     
                          sop(files[x]);
                        
                      }
                  
                      }
                   public static void sop(Object obj)
                   {
                      System.out.println(obj);
                   }
             }