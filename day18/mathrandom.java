import java.util.*;
     
     class MathDemo
     {
       public static void main(String[] args)
       {
            double d1=Math.ceil(12.34);//ceil���� ���ش���ָ�����ݶ���С����,����13
            sop(d1);
            
            double d2=Math.floor(12.34);//floor���� ����С��ָ�����ݶ��������,����12
             sop(d2);
             
             long l=Math.round(12.34);//round���� ��������
             sop(l);
             
             double d3=Math.pow(2,3);//pow���� ����2��3�η�
             sop(d3);
       
               
             ///�����
             for(int x=0;x<10;x++)
             {
             double d5=Math.random();//���ذ���0������1��0��1֮���С��
             sop(d5);
             
             
               double d4=(int)(Math.random()*10+1);//����0 ��10֮���С��
             } 
             
             
              Random r=new Random(); 
              for(int x=0;x<10;x++)
              {
             int y= r.nextInt(10);
              sop(y);
              
              
              }
  
  
            }
       
       public static void sop(Object obj)
       {
       
            System.out.println(obj);
       }
     }