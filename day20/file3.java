    /*
      File  listRoots();//�г���������Ч���̷�
     File list();//��ӡָ��Ŀ¼�������ļ������ļ�������,���������ļ�,����list������file��������װ��һ��Ŀ¼,��Ŀ¼�������
     
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
                         
                             return name.endsWith(".bmp");//���˳�����.bmp��β�������ļ���
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
                       String [] names=f.list();//��ӡָ��Ŀ¼�������ļ������ļ�������,���������ļ�
                                                  //����list������file��������װ��һ��Ŀ¼,��Ŀ¼�������
                       for(String name :names)
                       sop(name);
                     
                     }
       
                     
                      public static void listRoots()
                     {
                       
                       
                       
                       File[] files=new File.listRoots();//�г���������С���̷�
                       for(File f:files)
                       sop(f);//������
                     
                     }
       
                   public static void sop(Object obj)
                   {
                      System.out.println(obj);
                   }
             }