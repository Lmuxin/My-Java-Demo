      import  java.util.*;
      class Arraylisttest

      {
      public static void sop(Object obj)
      {
      
      System.out.println(obj);
      
      
      }
      
      

      
          public static void main(String[] args)
          {
           ArrayList  al=new ArrayList();
           al.add("java2");
              al.add("java1");
                 al.add("java2");
                    al.add("java1");
                      al.add("java3");
                      
                      sop(al);
                      
        
                      al=singleElement(al);
                      
                      sop(al);
          }
          
          
          public static ArrayList singleElement(ArrayList al)
          {
              ArrayList  newAl=new ArrayList();
              Iterator it=al.iterator();
                while(it.hasNext())
                {
                
                  Object obj=it.next();
                  if(!newAl.contains(obj))
                   newAl.add(obj);
                
              
                   }
                    
                return newAl;
          
          }
      
  
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      