import java.util.*;
     
     class MathDemo
     {
       public static void main(String[] args)
       {
            double d1=Math.ceil(12.34);//ceil方法 返回大于指定数据段最小整数,返回13
            sop(d1);
            
            double d2=Math.floor(12.34);//floor方法 返回小于指定数据段最大整数,返回12
             sop(d2);
             
             long l=Math.round(12.34);//round方法 四舍五入
             sop(l);
             
             double d3=Math.pow(2,3);//pow方法 返回2的3次方
             sop(d3);
       
               
             ///随机数
             for(int x=0;x<10;x++)
             {
             double d5=Math.random();//返回包含0不包含1的0到1之间的小数
             sop(d5);
             
             
               double d4=(int)(Math.random()*10+1);//返回0 到10之间的小数
             } 
             
             
              Random r=new Random(); 
              for(int x=0;x<10;x++)
              {
             int y= r.nextInt(10);
              sop(y);
              
              
              }
  
  
            }
       
       public static void sop(Object obj)
       {
       
            System.out.println(obj);
       }
     }