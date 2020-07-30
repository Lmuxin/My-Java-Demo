
 class strtest1
    {
      public static void main(String[] args)
        {
        
         //获取长度
        method_get();
        //根据索引获取字符
        
        sop(str.charA(4));
        
        //根据字符获取索引
        
        sop(str.indexOf('a'));
        
        //反向索引一个字符出现的位置
        
        
        sop(str.lastIndexOf('a'));
        
        }
  
  
     public static void method_get()
      {
        String str="abdesef";
        sop(str.length());
      
      
      }



     public static  void sop(Object obj)
     {
           System.out.println(obj);
     
     
     }
     

     
     }
    
    
   
 
    
    
    
    
    