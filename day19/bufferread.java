  /*
  ������ ,��Ϊ��������Ĳ���Ч�ʶ���,�����ڴ���������֮ǰ,����Ҫ����������
  ��ȡ���������ṩ��һ��һ�ζ�һ�еķ���  readLine() ,������ı����ݵĻ�ȡ
  ������nullʱ��ʾ�����ļ�ĩβ
  */
  
  
   import  java.io.*;
    class BufferRead
    {
    
        public static void main(String[] args)throws IOException
        {
            //����һ���ַ���ȡ������
            
            FileReader fr=new FileReader("buf.txt");
            
            //Ϊ������ַ���ȡ����Ч��,�����˻��弼��
            //���ַ���������Ϊ�������ݸ��������Ĺ��캯������
            BufferedReader bufr=new BufferedReader(fr);
            
           String s1=bufr.readLine();//һ�ζ�ȡһ��
             System.out.println(s1);
             
              
             
           String line =null;
           while((line=bufr.readLine())!=null)
           {
             System.out.println(line);
           }
     
          
            bufr.close();
        
        }
    
    }