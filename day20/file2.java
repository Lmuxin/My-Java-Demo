             /*
         File  ��ĳ�������
             ����
             boolean createNewFile();//��ָ��λ�ô����ļ� ,���ļ��Ѿ�����,�򲻴���,����false,���������һ��,����������Ѵ����ļ�,���ļ������»ᱻ����
             
             ɾ��
             boolean delete();//ɾ��ʧ�ܷ��ؼ�
             void deleteOnExit();//�����˳�ʱɾ��ָ���ļ�
             
             �ж�
             boolean canExecute();//�ж��ļ��Ƿ��ִ��
             boolean existe();//�ļ��Ƿ����
             boolean mkdir();//���������ļ���
              boolean mkdirs();//�����༫�ļ���
              boolean isDirectory();//�Ƿ���Ŀ¼
              boolean  isFile(0;//�Ƿ����ļ�
              boolean isHidden();//�Ƿ���һ�������ļ�
             boolean  isAbsolute();//�Ƿ��Ǿ���·��
             
             ��ȡ��Ϣ
             String  getName();//�ļ�����
             getPath();//���·��
             getParent();//�÷������ؾ���·���е��ļ���Ŀ¼,����ȡ���·��,����null,�������·��������һ��Ŀ¼,��ô��Ŀ¼���Ƿ��ؽ������  "abgd\\f.txt",����abgf
             getAbsolutePath();//����·��
           long  getLatModified();//���һ���޸ĵ�ʱ��
            long  length();//����·������ 
             boolean renameTo();//������

               
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
                       
                       sop(f.renameTo(f2));//������
                     
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
                       f.deleteOnExit();//�˳�ʱɾ��
                     
                     }
                     
                     
                     
                   public  static void method_2()
                   {
                     File f=new File("file.txt");
                     sop(f.canExecute());
                     sop(f.exists());
                     
                     
                     //�����ļ���
                     
                     File dir=new File("abc");//���ڵ�ǰĿ¼��
                    sop( dir.mkdir());//����Ƿ񴴽��ɹ�,true ����false,ע��mkdirֻ�ܴ�������Ŀ¼
                     
                   
                   }  

                     public  static void method_3()throws IOException
                   {
                     File f=new File("file.txt");
                    
                    
                    //���ж��Ƿ����ļ������ļ���ʱ,����Ҫ���ж��ļ������װ�������Ƿ����
                    //ͨ��exists�ж�
                    sop(f.isDirectory());//false
                    sop(f,isFile());//false    file.txt����������
                    
                    
                    
                    sop(f.isAbsolute());//�ж��Ƿ��Ǿ���·��,�����̷�
                    
                    
                    
                    
                    
                    
                    
                   
                   }  

                          
                       
                       
                          
                   public static void sop(Object obj)
                   {
                      System.out.println(obj);
                   }
             }