    /*
    IO�ı��ļ���ȡ��ʽ
    */
    
    import java.io.*;
    class IoDemo4
    { 
      public static void main(String[] args) throws IOException
        { 
       
        //��һ��::����һ���ļ���ȡ������,��ָ�����Ƶ��ļ������
        //Ҫ��֤���ļ����Ѿ����ڵ�,��������,�ᷢ���쳣 FileNotFoundException
         FileReader  fr=new FileReader("demo1.txt");
         
         
          //�ڶ���::���ö�ȡ����read����
          //read����һ��ֻ��һ���ַ�,���һ��Զ����¶�,�Ѷ�ȡ���ַ�����������,������ĩβ�᷵��-1
         // int ch=  fr.read();
         // System.out.println(ch);
         
         //��������ѭ�����,�ȽϷ��� 
          /*while(true)
          {
          int ch=  fr.read();
          if(ch==-1)
          brak;
            System.out.println(ch);
          }
          */
          //��һ��ѭ��
          int ch=0;
          while((ch=fr.read())!=-1)
          {
             System.out.println(ch);
          
          }
      
          fr.close();
                
      
          }
     }