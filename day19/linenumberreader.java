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
          lnr.setLineNumber(100);//自己设置行号从100开始,不是从100行开始取得,而是把原来的0开始变为100开始,
           while((line=lnr.readLine())!=null)
             { 
             System.out.println(line);
             
             lnr.getLineNumber();//从0开始取得行号  
             }
          
          lnr.close();
          
        }
    ]