   /*
   Properties  ��hashtable������
   
   Ҳ����˵���߱�map���ϵ��ص�,������洢�ļ�ֵ�Զ����ַ���
   Ҳ�Ǽ����к�io�������ϵļ�������
   �ö�����ص��� �����ü�ֵ����ʽ�������ļ�
   */
   
      import  java.io.*;
      import java.util.*;
      class  property
      {
      
      public static void main(String[] args)
      {
      
         setProperty();
         
      }
      
      
      
      //���úͻ�ȡԪ��
          public static void setProperty() 
          {
          
           Properties prop=new Properties();
           prop.setProperty("shanghai","30");
            prop.setProperty("lisi","18");
            System.out.println(prop);
            
            
            
            //��ȡ
            
            String value=prop.getProperty("lisi");
            System.out.println(value);
            
            prop.setProperty("lisi","89");//����ֵ
            
            
          Set<String> names=prop.stringPropertyNames();
          for(String s:names)
          {
          
           System.out.println(s+"...."+prop.getProperty(s));
            
          }  
            
     
          }

      }