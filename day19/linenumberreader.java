   /*
    LineNumberReader 
    */
    import java.io.*;
    class   LineNumberReader
    {
        public static void main()String[] args) throws IOException
        {
          FileReader fr=new FileReader("zhuangshi.java"):
          LineNumberReader lnr=new LineNumberReader(fr);
          
          String line=null;
          lnr.setLineNumber(100);//�Լ������кŴ�100��ʼ,���Ǵ�100�п�ʼȡ��,���ǰ�ԭ����0��ʼ��Ϊ100��ʼ,
           while((line=lnr.readLine())!=null)
             { 
             System.out.println(line);
             
             lnr.getLineNumber();//��0��ʼȡ���к�  
             }
          
          lnr.close();
          
        }
    ]