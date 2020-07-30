import java.util.*;
class SystemDemo
{
public static void  main(String[] args)
{  
          Properties prop=System.getProperties();
/*
因为Properties 是Hashtable的子类,也就是Map的子类对象,那么就可以通过map的方法取出该集合的元素
*/
for(Object obj:prop.keySet())
{
String values=(String)prop.get(obj);
System.out.println(values);
}
    }

       }
  
