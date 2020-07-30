     import java.util.*;
     import java.text.*;
      class DateDemo
   {
     public static void main(String[] args)throws Exception
       {
           Date d=new Date();
           System.out.println(d);
           //将模式封装在SimpleFormat对象中
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 E hh;mm:ss");//E是星期几
           //调用format方法
           String time =  sdf.format(d);
        
             System.out.println(time);
       
       
       }
     public static void sop(Object obj)
       {
          System.out.println(obj);
       }
   }