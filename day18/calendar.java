 import java.util.*;
    import java.text.*;
      class Calendartest
   {
     public static void main(String[] args)throws Exception
       {

             Calendar c=Calendar.getInstance();
         //���  ���·�    
        String[]  mons={"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
          
          
          String [] weeks={"","������","����һ","���ڶ�","������","������","������","������"};
          int index2=c.get(Calendar.DAY_OF_WEEK);
          
             
           int index=c.get(Calendar.MONTH);
           
             sop(c.get(Calendar.YEAR)+"��");// ֻȡ��
             
             sop(mons[index]);  
             
            //sop((c.get(Calendar.MONTH)+1)+"��");//��Ϊ�������ӡ�·��Ǵ�0��ʼ��
            
             sop(c.get(Calendar.DAY_OF_MONTH)+"��");//��
             
             sop(weeks[index2]);
              sop("����"+c.get(Calendar.DAY_OF_WEEK));//����       
       }
     public static void sop(Object obj)
       {
          System.out.println(obj);
       }
   }