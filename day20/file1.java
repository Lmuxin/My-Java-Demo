             /*
             File���Բ����ļ�Ҳ���Բ����ļ���  
               
             */
  
             import  java.io.*;
             
             class FileDemo
             {
             
                     public static void main(String[] args)
                     {
                        conMethod();
                    
                     }
                   
                           //����File����

                   public static void conMethod()
                   {
                     //��a.txt��װ��file����,���Խ����еĺ�δ���ֵ��ļ������ļ��зŷ�װ�ɶ���
                     File f1=new File("a.txt");
                    
                    //
                   
                   
                     File f2=new File("C:\\ABC","b/txt");//ABC��Ŀ¼,b.txt��Ŀ¼�µ��ļ�
                     
                       File d=new File("c:\\abc");
                        File d=new File("c:"+File.separator+"abc");//Ŀ¼�ָ�������һ��һ��
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