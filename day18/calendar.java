 import java.util.*;
    import java.text.*;
      class Calendartest
   {
     public static void main(String[] args)throws Exception
       {

             Calendar c=Calendar.getInstance();
         //查表法  求月份    
        String[]  mons={"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
          
          
          String [] weeks={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
          int index2=c.get(Calendar.DAY_OF_WEEK);
          
             
           int index=c.get(Calendar.MONTH);
           
             sop(c.get(Calendar.YEAR)+"年");// 只取年
             
             sop(mons[index]);  
             
            //sop((c.get(Calendar.MONTH)+1)+"月");//因为计算机打印月份是从0开始的
            
             sop(c.get(Calendar.DAY_OF_MONTH)+"日");//日
             
             sop(weeks[index2]);
              sop("星期"+c.get(Calendar.DAY_OF_WEEK));//星期       
       }
     public static void sop(Object obj)
       {
          System.out.println(obj);
       }
   }