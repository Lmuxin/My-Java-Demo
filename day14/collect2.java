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
             //���
             a1.add("java1");
              a1.add("java2");
               a1.add("java3");
             
             sop("ԭ������"+a1);
             //��ָ��λ�����Ԫ��
             
             a1.add(1,"eclipse");//��1�ű�λ�����eclipse
             
             //ɾ��
             
             a1.remove(2);//ɾ��2�ű�λ��Ԫ��
             
             
             ///�޸�Ԫ��
             
             a1.set(2,"java0002");//2�ű�λ�ø�ΪJava0002
             
             //ͨ���ű��ȡԪ��
             a1.get(1);//��ȡ�ű�1��Ԫ��
             
             //��ȡ����Ԫ��
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