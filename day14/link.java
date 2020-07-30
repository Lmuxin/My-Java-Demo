      import java.util.*;
      class  linklist
       {   private LinkedList link;
          linklist()
           {
           
           link=new LinkedList();
           
                
           }
           
           public void myAdd(Object obj)  
           {
           
           link.addFirst(obj);
           
           
           
           }
           
           public Object  myGet()
           {
           
           return link.removeLast();
           
           
           }
           
           
           
           public boolean isNull()
           {
           
          return link.isEmpty();
           
           
           
           }
  
       }
       
       class lingtest
       {
       public static void main(String[] args)
       {
       linklist l=new linklist();
       
       l.myAdd("java1");
        l.myAdd("java2");
         l.myAdd("java3");
 l.myAdd("java4");
       
       while(!l.isNull())
       {
       
       System.out.println(l.myGet());
       
       }
       
     
       }
       

       
       }