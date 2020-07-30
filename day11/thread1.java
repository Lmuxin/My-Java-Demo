         class Thread1 extends Thread
              {

                 public void run()
                         { System.out.println("i  love you ");}



               }
class Test
{

public static void main(String[] args)
{
Thread1 t1=new Thread1();//创建好一个线程
t1.start();

}


}