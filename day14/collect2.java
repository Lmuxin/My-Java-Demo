     import java.util.*;
     
     class  collect2
     {
     
     
     
       public static void sop(Object obj)
       {
            System.out.println(obj);
       
       }
         
         public static void main(String[] args)
         {
             ArrayList a1=new ArrayList();
             //添加
             a1.add("java1");
              a1.add("java2");
               a1.add("java3");
             
             sop("原集合是"+a1);
             //在指定位置添加元素
             
             a1.add(1,"eclipse");//在1脚标位置添加eclipse
             
             //删除
             
             a1.remove(2);//删除2脚标位置元素
             
             
             ///修改元素
             
             a1.set(2,"java0002");//2脚标位置改为Java0002
             
             //通过脚标获取元素
             a1.get(1);//获取脚标1的元素
             
             //获取所有元素
             for(int x=0;x<a1.size();x++)
               {
                   System.out.println(a1.get(x));
               }
             
           Iterator it=a1.iterator();
           while(it.hasNext())
           {
           sop(it.next());
           }
         
         }
         
     
     
     
     }