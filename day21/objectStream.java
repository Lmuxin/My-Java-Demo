       /*
       IO���е���������
       
       ��ӡ��
        PrintWriter 
        PrintStream
       ������
       SequenceInputStream(�Զ�������кϲ�)
       ��������
       ObjectInputStream
       ObjectOutputStream
        ���������������Ķ�����Ҫʵ��Serializable(��ǽӿ�) 
       */
       
       import java.io.*;
       class ObjectStream
       {    
       public static void main(String[] args)throws IOException
          {
            writeObj();
            resadObj(); 
          }
          
          public static void  readObj()throws IOException
          {
          ObjectInputStream ois=
          new ObjectInputStream(new FileInputStream("obj.txt"));
          
          Person p=(Person)ois.readObject();
          System.out.println(p);
          
         // oos.writeObject(new Person("lisi",39));
          oos.close();
          
          }
          
          
          public static void  writeObj()throws IOException
          {
          ObjectOutputStream oos=
          new ObjectOutputStream(new FileOutputStream("obj.txt"));
          oos.writeObject(new Person("lisi",39));
          oos.close();
          
          }
       }
       
       class Person  implements Serializable//��ǽӿ�����û�з���
       {
          public static final long serialVersionUID=784744878L;//�Զ���uidֵ
          private String name;
        transient int age;//age�������л�,��֤��ֵ�ڶ��ڴ��д���,���ܴ����ı���
            Person(String name,int age)
            {
            
            this.name=name;
            this.age=age;
            
            
            }
         
          public String toString()
            {
            return ("name::"+name+"sge::"+age);
            
            }
  }