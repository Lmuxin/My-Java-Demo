       /*
       正则表达式(regex):符合一定规则的表达式
       作用:用于专门操作字符串
       好处:可以简化对字符串的复杂操作
       特点:用特定的符号表示一些代码操作,这就是简化
        具体操作功能:
        匹配: String  matches()//用规则匹配整个字符串,只要有一次不符合,就停止匹配,返回false
        String regex="[abc]";//字符串只有一位,a或b或c开头
         String regex="[^abc]";//字符串只有一位,除了a或b或c开头都可以
        String regex="[a-zA-Z][0-9]";//字符串有两位,第一个是字母第二个是数字
        切割:String split();
        替换:String  replaceAll();
        
  
       
       对qq号码进行校验
        要求:5到15位  0不能开头  只能是数字
       if方式是使用了String类中的方法进行组合完成了需求,但是太复杂
       
       .   一点表示字符数字都可以
       \d  表示数字
       String regex="\\d";
       
       */
     class  Demo
     {
         public static void main(String[] args)
         {
         //check1();
         // check2();
            //checkqq();
            //spileDemo("zhangsan.lisi.wangwue","\\.");//按照.切
             //spileDemo("c:\\abc\\def\\a.txt","\\\\");//按照\\切
                  // spileDemo("erkktyqquio","(.)\\1+");//按叠词切,将规则封装成一个组,用()完成,组的出现都有编号,
                                                       //从1开始,想要使用已有的组可以通过\n(n就是组的编号)来获取
            String str="dfjdfhnjs374878";//将字符串中的数字替换我i#
            replace(str,"\\d{5,}","#");//数字连续5个或者5个以上就替换为#
            
            
            String str1="ndfjkkhudhwwncjiifg";//将叠词替换为#
            replace(str1,"(.)\\1+","#");
            
            String str2="ndfjkkhudhwwncjiifg";//将叠词替换为单个字符   sss->s
            replace(str2,"(.)\\1+","$1");//$1拿前一个规则的第一个组
            
            
            
         }
           
           
            public  static void replace(String str,String reg,String newstr)
          {
             str=str.replaceAll(reg,newstr);
             System.out.println(str);
            
          
          
          }
          
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
         
            public  static void spileDemo(String str,String reg)
            {
              
              String[] arr=str.split(reg);
              for(String s:arr)
              {
                System.out.println(s);
              
              }
          
          }
          

          
           public static void checkqq()
           {
             String qq="7348783478";
             String regex="[1-9][0-9]{4,14}";
             boolean flag=qq.matches(regex);
             if(flag)
             System.out.println(qq+"....is ok");
             else
             System.out.println(qq+"....nonono");
           
           }
   
           public static void  check2()
           {
             String qq="526367";
             int len=qq.length();
             if(len>5&&len<15)
             {
                 if(!qq.startsWith("0"))
                 {
                 
                     try
                     {
                     long l=Long.parseLong(qq);
                      System.out.println(qq);
                 }
                 
                 
                 catch(NumberFormatException e)
                 {
                    System.out.println("出现非法字符");
                 }
                 
     
                 
                   /*char[] arr=qq.toCharArray();
                   boolean flag=true;
                   
                           for(int x=0;x<arr.length;x++)
                           {
                                 if(!(arr[x]>='0'&&arr[x]<='9'))//为什么用单引号,因为arr是字符数组
                                 
                                    { 
                                      flag=false;
                                       break;
                                     }
                                 
                                  
                           }
                             if(flag)
                             {
                              System.out.println(qq);
                             }
                               else 
                               {
                                   System.out.println("出现非法字符");
                               }
                          */
                      }
                   else
                   {
                    System.out.println("不可以0开头");
                   
                   }
                   
                 
                 }
                 
                 else
                 {
                  System.out.println("长度错误");
                 }
        
       }
    
    

    
       
       public static void  check1()
       {
           String qq="526367";
           int len=qq.length();
             if(len>5&&len<15)
             {
                 if(!qq.startsWith("0"))
                 {
                   char[] arr=qq.toCharArray();
                   boolean flag=true;
                   
                   for(int x=0;x<arr.length;x++)
                   {
                         if(!(arr[x]>='0'&&arr[x]<='9'))//为什么用单引号,因为arr是字符数组
                         
                            { 
                              flag=false;
                               break;
                             }
                         
                          
                   }
                           if(flag)
                           {
                            System.out.println(qq);
                           }
                             else 
                             {
                                 System.out.println("出现非法字符");
                             }
                          
                      }
                   else
                   {
                    System.out.println("不可以0开头");
                   
                   }
                 
                 }
                 
                 else
                 {
                  System.out.println("长度错误");
                 }
        
       }
       
       }