       /*
       IO包中的其他的类
       
       打印流
        PrintWriter 
        PrintStream
       序列流
       SequenceInputStream(对多个流进行合并)
       操作对象
       ObjectInputStream
       ObjectOutputStream
        上面这两个操作的对象需要实现Serializable(标记接口) 
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
       
       class Person  implements Serializable//标记接口里面没有方法
       {
          public static final long serialVersionUID=784744878L;//自定义uid值
          private String name;
        transient int age;//age不被序列化,保证其值在堆内存中存在,不能存在文本中
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