       /*
          获取功能:将字符串中复合规则的子串取出
          
       步骤:
       1.将正则表达式封装成对象
       2.让正则表达式和要操作的字符串相关联
       3.关联后,获取正则匹配引擎
       4.通过引擎对符合规则的子串进行比较  ,比如取出

          
       */
           
 
         import java.util.regex.*; 
           
           class  Regex
         {
             public static void main(String[] args)
             {
           
                
                getDemo();
                test();
                 
             }
               
                public static void email()
                
                 {
                 //邮件格式校验
                 String mail="abc12@sina.com";
                 String reg="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//较为精确匹配
                 reg="\\w+@\\w+(\\.\\w+)+";//较为不精确匹配
     
                }

                
               public static void getDemo()
               {
                  String str="ming tian jiu yao fang jia le";//取3个字母在一起的
                  //str="1357547";
                 // String reg="[1-9]\\d{4,14}";
                 String reg="\\b[a-z]{3}\\b";
                  
                  //将规则封装成对象
                  
                  
                  Pattern p= Pattern.compile(reg);
                 
                  //让正则对象和要作用的字符串关联起来
                    Matcher m=p.matcher(str);
                    //System.out.println(m.matches());//matches作用于整个字符串,其实String类中的matches方法用的就是Pattern和Matcher对象来完成的
                    //只不过被String 的方法封装后,用起来比较简单,但功能单一
               
              /* boolean b=m.find();//将规则作用到字符串上,并进行符合规则的子串查找
               System.out.println(b);
                System.out.println(m.group());*/
                
                while(m.find())
                {
                    System.out.println(m.group());
                System.out.println(m.start()+"....."+m.end());//字符的开头索引和结尾索引
                }

               }   
               
               
               public static void test()
               {
               
               
               /*到底使用四种功能的哪一个
               1.如果只想知道该字符串是否对错,使用匹配
               2.想要将已有的字符串变成另一个字符串,替换
               3.想要按照自定的方式将字符串变成多个字符串,切割,规则获取子串
               4.先要拿到复合要求的字符串子串,获取,获取符合规则的子串
               */
               
               
               String str="我我...我我...我要...要要...要要...学学学...学学...编编编...编编..程.程程...程...程";
                 
                 
                 /*
                 将已有字符串变成另一个字符串,使用替换
                 1.先将.去掉
                 2.再将多个重复内容编程单个字符
                 
                 */
                 
                 
                 str=str.replaceAll("\\.+","");//干掉..
                 System.out.println(str);
                 
                 str=str.replaceAll("(.)\\1+","$1");//干掉叠词
                  System.out.println(str);
               
               }
  
                   
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          