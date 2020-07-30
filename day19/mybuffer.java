      /*
      �Լ���һ��bufferedreader�� 
      
      ������BufferedReader�������з���readLine()��ԭ���,�����Զ���һ�����а���һ������
      ��readLineһ�µķ�����ģ��һ��BufferedReader
      
      
      */
      import java.io.*;
      class  MyBufferReader
      {  
          private FileReader r;
          
          MyBufferReader(FileReader r)
          {
          this.r=r;
          }
      
         //����һ�ζ�һ�����ݵķ���
         
         public String myReadLine()throws IOException
         {
          //����һ����ʱ������,ԭ��BufferReader��װ�����ַ�����
          //Ϊ�˷���,����һ��StringBuilder����,��Ϊ���ջ���Ҫ�����ݱ���ַ���
          
          StringBuilder sb=new StringBuilder();
          int ch=0;
          while((ch=r.read())!=-1)
          {
          
           if(ch=='\r')
           continue;
           
           if(ch=='\n')
           return sb.toString();
           
          else
            sb.append((char)ch);

          }
          if(sb.length()!=0)
          return sb.toString();
          return null;
         
         }
         
         public void myclose() throws IOException
         {
           r.close();
         }

      
      }
    
      class mubufferdemo
      {
      public static void main(String[] args) throws IOException
      {
        FileReader fr=new FileReader("buf.txt");
        MyBufferReader  mb=new MyBufferReader(fr);
        String line=null;
        while((line=mb.myReadLine())!=null)
        {
        
        System.out.println(line);
        
        }
        mb.myclose();
      
      }
      
      
      }