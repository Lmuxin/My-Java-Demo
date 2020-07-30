    import java.util.*;
    
    class MapDemo
    {
    public static void main(String[] args)
    {
    
    Map<String,String> m=new HashMap<String,String>();
    //Ìí¼ÓÔªËØ
    
    m.put("01","zhangsan1");
     m.put("02","zhangsan2");
    m.put("03","zhangsan3");
    System.out.println(m.containsKey("02"));
     System.out.println(m.remove("02"));
    
      System.out.println(m.get("01"));
    
    }
    
    
  
    
    }