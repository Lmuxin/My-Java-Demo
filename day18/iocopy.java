    /*
    IO�����ı��ļ�
    
    
    ��C���ļ�������d��
    
    ���Ƶ�ԭ����ǽ�c���µ��ļ����ݴ洢��D�̵�һ���ļ���
    
    ����:
    1.��D�̴���һ���ļ�,���ڴ洢C���ļ��е�����
    2.�����ȡ����C���ļ�����
    3.ͨ�����϶�д������ݴ洢
    4.�ر���Դ
    */
    
    import java.io.*;
    class CopyText
    { 
        public static void main(String[] args) throws IOException
          { 

           //  copy_1();
             copy_2();
           
          }            
            
         /*   //��һ�ַ�ʽ: ��C�̶�ȡһ���ַ�,����D��дһ���ַ�
            public  static void copy_1()
            {
                //����Ŀ�ĵ�
                
                FileWriter fw=new FileWriter("RuntimeDemo_copy.txt");
                
                //�������ļ�����
                
                FileReader fr=new FileReader("RuntimeDemo.java");
                int ch=0;
                while((ch=fr.read())!=-1)
                {
                     fw.write(ch);
            
                
                }
                 
                 fw.close();
                 fr.close();

            }
                */
                
            //�ڶ��ַ�ʽ: ��C�̶�ȡһ���ַ�,����D��дһ���ַ�
            
              public  static void copy_2()
                {
                    FileWriter fw=null;
                    FileReader fr=null;
                    try
                    {
                      fw=new FileWriter("SystemDemo_copy.txt");
                      fr=new FileReader("SystemDemo.java");    
                      
                      char [] buf=new char[1024];
                       
                      int len=0;
                        while((len=fr.read(buf))!=-1)  
                        {
                            fw.write(buf,0,len);
                        
                        }         
                    }
                
                catch(IOException e)
                  {
                   throw new RuntimeException("��дʧ��");
                  }
                  finally
                  {
                        if(fr!=null)
                        try
                        {
                          fr.close();
                          
                         }
                        catch(IOException e)
                        {
                        
                        }
                        
                        if(fw!=null)
                        try
                        {
                          fw.close();
                          
                          }
                        catch(IOException e)
                        {
                        
                        }
      
                        
                  }
                
   
                }
      
         }
       