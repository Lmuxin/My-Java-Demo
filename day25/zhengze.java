       /*
       ������ʽ(regex):����һ������ı��ʽ
       ����:����ר�Ų����ַ���
       �ô�:���Լ򻯶��ַ����ĸ��Ӳ���
       �ص�:���ض��ķ��ű�ʾһЩ�������,����Ǽ�
        �����������:
        ƥ��: String  matches()//�ù���ƥ�������ַ���,ֻҪ��һ�β�����,��ֹͣƥ��,����false
        String regex="[abc]";//�ַ���ֻ��һλ,a��b��c��ͷ
         String regex="[^abc]";//�ַ���ֻ��һλ,����a��b��c��ͷ������
        String regex="[a-zA-Z][0-9]";//�ַ�������λ,��һ������ĸ�ڶ���������
        �и�:String split();
        �滻:String  replaceAll();
        
  
       
       ��qq�������У��
        Ҫ��:5��15λ  0���ܿ�ͷ  ֻ��������
       if��ʽ��ʹ����String���еķ�������������������,����̫����
       
       .   һ���ʾ�ַ����ֶ�����
       \d  ��ʾ����
       String regex="\\d";
       
       */
     class  Demo
     {
         public static void main(String[] args)
         {
         //check1();
         // check2();
            //checkqq();
            //spileDemo("zhangsan.lisi.wangwue","\\.");//����.��
             //spileDemo("c:\\abc\\def\\a.txt","\\\\");//����\\��
                  // spileDemo("erkktyqquio","(.)\\1+");//��������,�������װ��һ����,��()���,��ĳ��ֶ��б��,
                                                       //��1��ʼ,��Ҫʹ�����е������ͨ��\n(n������ı��)����ȡ
            String str="dfjdfhnjs374878";//���ַ����е������滻��i#
            replace(str,"\\d{5,}","#");//��������5������5�����Ͼ��滻Ϊ#
            
            
            String str1="ndfjkkhudhwwncjiifg";//�������滻Ϊ#
            replace(str1,"(.)\\1+","#");
            
            String str2="ndfjkkhudhwwncjiifg";//�������滻Ϊ�����ַ�   sss->s
            replace(str2,"(.)\\1+","$1");//$1��ǰһ������ĵ�һ����
            
            
            
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
                    System.out.println("���ַǷ��ַ�");
                 }
                 
     
                 
                   /*char[] arr=qq.toCharArray();
                   boolean flag=true;
                   
                           for(int x=0;x<arr.length;x++)
                           {
                                 if(!(arr[x]>='0'&&arr[x]<='9'))//Ϊʲô�õ�����,��Ϊarr���ַ�����
                                 
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
                                   System.out.println("���ַǷ��ַ�");
                               }
                          */
                      }
                   else
                   {
                    System.out.println("������0��ͷ");
                   
                   }
                   
                 
                 }
                 
                 else
                 {
                  System.out.println("���ȴ���");
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
                         if(!(arr[x]>='0'&&arr[x]<='9'))//Ϊʲô�õ�����,��Ϊarr���ַ�����
                         
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
                                 System.out.println("���ַǷ��ַ�");
                             }
                          
                      }
                   else
                   {
                    System.out.println("������0��ͷ");
                   
                   }
                 
                 }
                 
                 else
                 {
                  System.out.println("���ȴ���");
                 }
        
       }
       
       }