   class runtimeDemo
   {
   public static void mian(String[] args)throws Exception
   {
   
   Runtime r= Runtime.getRuntime();
   
   r.exec("winmine.exe");//打开一个可执行文件
   
   Process p=r.exec("winmine.exe");
   p.distory();//杀掉子进程
   }
   }