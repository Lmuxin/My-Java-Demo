class Produce
{
public static void main(String[] args)
{
Resourse r=new Resourse();
Producter p=new Producter(r);
Consumer c=new Consumer(r);
Thread t1=new Thread(p);
Thread t2=new Thread(c);
t1.start();
t2.start();
 
}


}

class Resourse
{

private String name;
private int count=1;
private boolean flag=false;

public  synchronized  void set(String name)

{

while(flag)
try
{
   this.wait(); 
  }

  catch(Exception e) 
  {   
     }

this.name=name+"......."+count++;
System.out.println(Thread.currentThread().getName()+".......生产者......"+this.name);
flag=true;
this.notifyAll();

}

public synchronized void out()
{
while(!flag)
try
 {this.wait();} 
 catch(Exception e){}
System.out.println(Thread.currentThread().getName()+".......消费者......"+this.name);
flag=false;
this.notifyAll();

}


}


class Producter implements Runnable
{
private Resourse res;
Producter (Resourse res)
{
this.res=res;
}

 public void run()
{
while(true)
{

res.set("+商品+");
}

}
}

class Consumer implements Runnable
{

   private Resourse res;
   Consumer (Resourse res) 
    {
    this.res=res;
     }

    public void run()
     { 
    while(true)
     {

      res.out();
     }

     }

} 