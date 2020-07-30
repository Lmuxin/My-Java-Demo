       class Thread2 implements Runnable
      {
             private int ticket=100;
         public void run()
       {


      while(true)

{
if(ticket>0)
    { System.out.println(Thread.currentThread().getName()+"..."+ticket--);}

        }
              

}
         }
     class Test2 
     {
   public static void main(String[] args)
     {
     Thread2 t=new Thread2();

     Thread t1=new Thread(t);
     Thread t2=new Thread(t);
     Thread t3=new Thread(t);
     Thread t4=new Thread(t);
    
     t1.start();
     t2.start();
     t3.start();
     t4.start();


     }



     }

