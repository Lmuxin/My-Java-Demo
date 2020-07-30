   /*
   删除一个带内容的目录
   删除原理 
   在windows中 删除目录是从里往外删除,既然是从里往外,就需要用递归
   */
   
     import  java.io.*;
     class delete
     (
           public static void main()
           {
           File dir=new File("d:\\java\day20");
           remove(dir);
           
           }
               public static void remove(File dir)
               {
                  File [] files=new dir.listFiles();
                  for(int x=0;x,files.length();x++)
                  {
                    if(files[x].isDirectory())
                    
                      remove(files[x]);
                      else
                      
                        System.out.println(files[x].toString()+"....."+files[x].delete()) ;           
 
                    }
                   System.out.println(dir.delete())  ;
                  }
           )