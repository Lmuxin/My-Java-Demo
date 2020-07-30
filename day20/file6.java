   /*
   Properties  是hashtable的子类
   
   也就是说他具备map集合的特点,他里面存储的键值对都是字符串
   也是集合中和io技术相结合的集合容器
   该对象的特点是 可以用键值对形式的配置文件
   */
   
      import  java.io.*;
      import java.util.*;
      class  property
      {
      
      public static void main(String[] args)
      {
      
         setProperty();
         
      }
      
      
      
      //设置和获取元素
          public static void setProperty() 
          {
          
           Properties prop=new Properties();
           prop.setProperty("shanghai","30");
            prop.setProperty("lisi","18");
            System.out.println(prop);
            
            
            
            //获取
            
            String value=prop.getProperty("lisi");
            System.out.println(value);
            
            prop.setProperty("lisi","89");//设置值
            
            
          Set<String> names=prop.stringPropertyNames();
          for(String s:names)
          {
          
           System.out.println(s+"...."+prop.getProperty(s));
            
          }  
            
     
          }

      }