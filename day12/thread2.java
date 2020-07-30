   import java.util.concurrent.locks.*;
   
    class Produce2
    {
      public static void main(String[] args)
      {
        Resourse r=new Resourse();
        Producter p=new Producter(r);
        Consumer c=new Consumer(r); 
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
         Thread t3=new Thread(c);
        Thread t4=new Thread(c);
        t1.start();
        t2.start();
         t3.start();
        t4.start();
        
       
      }
    }

    class Resourse
    {

      private String name;
      private int count=1;
      private boolean flag=false;

      private Lock lock =new ReentrantLock();
      private Condition condition_pro=lock.newCondition();
      private Condition condition_con=lock.newCondition();

      public  void set(String name) throws InterruptedException

        {
         lock.lock();
        try
           
           { while(flag)
           condition_pro.await(); 
           this.name=name+"......."+count++;

          System.out.println(Thread.currentThread().getName()+".......������......"+this.name);
          flag=true;
          condition_con.signal();
         }
         
         finally
         { lock.unlock();
          }
        }

    public synchronized void out()  throws InterruptedException
    {
      lock.lock();
      try
       {
         while(!flag)
         condition_con.await();

        System.out.println(Thread.currentThread().getName()+".......������......"+this.name);
        flag=false;
        condition_pro.signal();
        }
        
        finally
        {
        lock.unlock();
        }
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

               try{
               
                res.set("+��Ʒ+");
                }
                catch(InterruptedException e)
                {}
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
           try{
          res.out();
          }
          catch( InterruptedException  e)
          {}
         }

         }

    } 