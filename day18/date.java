     import java.util.*;
     import java.text.*;
      class DateDemo
   {
     public static void main(String[] args)throws Exception
       {
           Date d=new Date();
           System.out.println(d);
           //��ģʽ��װ��SimpleFormat������
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� E hh;mm:ss");//E�����ڼ�
           //����format����
           String time =  sdf.format(d);
        
             System.out.println(time);
       
       
       }
     public static void sop(Object obj)
       {
          System.out.println(obj);
       }
   }