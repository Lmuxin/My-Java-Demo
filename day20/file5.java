   /*
   ɾ��һ�������ݵ�Ŀ¼
   ɾ��ԭ�� 
   ��windows�� ɾ��Ŀ¼�Ǵ�������ɾ��,��Ȼ�Ǵ�������,����Ҫ�õݹ�
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