
   /*
   װ�����ģʽ  ����Ҫ�����еĶ�����й�����ǿʱ,���Զ�����,�����ж�����,
   �������еĹ���,���ṩ��ǿ����,��ô�Զ�������Ϊװ����
   
   װ����ͨ����ͨ�����췽�����ձ�װ�εĶ���
   */
   
      class Person
      {
          public void chifan()
          
          {
          System.out.println("�Է�");
          
          }
      }
      
      class Superperson
      {
       private Person p;
       
         Superperson(Person p)
         {
           this.p=p; 
         }
      
       public void superchifan()
       {
         System.out.println("��θ��");
         p.chifan();  //System.out.println("�Է�");
           System.out.println("���");
   
        }
     }
   class PersonDemo
   {
     public static void main(String[] args)
     {
       Person p=new Person();
       
       Superperson sp=new Superperson(p);
       sp.superchifan();
       
     
     }
   
   
   
   }