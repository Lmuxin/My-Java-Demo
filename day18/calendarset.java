 import java.util.*;
    import java.text.*;
      class Calendartest2
   {
     public static void main(String[] args)
       {

             Calendar c=Calendar.getInstance();
             c.set(2012,2,14);//����������
             printCalendar(c);
             c.add(Calendar.YEAR,4);//��4��
             
         
       }
     public static void printCalendar(Calendar c)
       {
         
        String[]  mons={"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
          
          
          String [] weeks={"","������","����һ","���ڶ�","������","������","������","������"};
          int index2=c.get(Calendar.DAY_OF_WEEK);
          
             
           int index=c.get(Calendar.MONTH);
           
             sop(c.get(Calendar.YEAR)+"��");// ֻȡ��
             
             sop(mons[index]);  //��
  
             sop(c.get(Calendar.DAY_OF_MONTH)+"��");//��
             
             sop(weeks[index2]);//����
             
          }
          
       public static void sop(Object obj)
           {
              System.out.println(obj);
           }

  
  }