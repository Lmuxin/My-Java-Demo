       /*
          ��ȡ����:���ַ����и��Ϲ�����Ӵ�ȡ��
          
       ����:
       1.��������ʽ��װ�ɶ���
       2.��������ʽ��Ҫ�������ַ��������
       3.������,��ȡ����ƥ������
       4.ͨ������Է��Ϲ�����Ӵ����бȽ�  ,����ȡ��

          
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
                 //�ʼ���ʽУ��
                 String mail="abc12@sina.com";
                 String reg="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//��Ϊ��ȷƥ��
                 reg="\\w+@\\w+(\\.\\w+)+";//��Ϊ����ȷƥ��
     
                }

                
               public static void getDemo()
               {
                  String str="ming tian jiu yao fang jia le";//ȡ3����ĸ��һ���
                  //str="1357547";
                 // String reg="[1-9]\\d{4,14}";
                 String reg="\\b[a-z]{3}\\b";
                  
                  //�������װ�ɶ���
                  
                  
                  Pattern p= Pattern.compile(reg);
                 
                  //����������Ҫ���õ��ַ�����������
                    Matcher m=p.matcher(str);
                    //System.out.println(m.matches());//matches�����������ַ���,��ʵString���е�matches�����õľ���Pattern��Matcher��������ɵ�
                    //ֻ������String �ķ�����װ��,�������Ƚϼ�,�����ܵ�һ
               
              /* boolean b=m.find();//���������õ��ַ�����,�����з��Ϲ�����Ӵ�����
               System.out.println(b);
                System.out.println(m.group());*/
                
                while(m.find())
                {
                    System.out.println(m.group());
                System.out.println(m.start()+"....."+m.end());//�ַ��Ŀ�ͷ�����ͽ�β����
                }

               }   
               
               
               public static void test()
               {
               
               
               /*����ʹ�����ֹ��ܵ���һ��
               1.���ֻ��֪�����ַ����Ƿ�Դ�,ʹ��ƥ��
               2.��Ҫ�����е��ַ��������һ���ַ���,�滻
               3.��Ҫ�����Զ��ķ�ʽ���ַ�����ɶ���ַ���,�и�,�����ȡ�Ӵ�
               4.��Ҫ�õ�����Ҫ����ַ����Ӵ�,��ȡ,��ȡ���Ϲ�����Ӵ�
               */
               
               
               String str="����...����...��Ҫ...ҪҪ...ҪҪ...ѧѧѧ...ѧѧ...����...���..��.�̳�...��...��";
                 
                 
                 /*
                 �������ַ��������һ���ַ���,ʹ���滻
                 1.�Ƚ�.ȥ��
                 2.�ٽ�����ظ����ݱ�̵����ַ�
                 
                 */
                 
                 
                 str=str.replaceAll("\\.+","");//�ɵ�..
                 System.out.println(str);
                 
                 str=str.replaceAll("(.)\\1+","$1");//�ɵ�����
                  System.out.println(str);
               
               }
  
                   
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          