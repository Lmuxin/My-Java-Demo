/*
      �г�ָ��Ŀ¼���ļ������ļ��� ������Ŀ¼�е�����   �ݹ�
      ��ΪĿ¼�л���Ŀ¼.ֻ��Ҫʹ��ͬһ���г�Ŀ¼���ܵĺ�������,���г������г��ֵ��������Ŀ¼�Ļ�,�������ٴε��ñ����� Ҳ���Ǻ��������������,�еݹ�
      �ݹ�Ҫע��  
      1.�޶�����
      2.Ҫע��ݹ�Ĵ���,���������ڴ����
     
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