   class runtimeDemo
   {
   public static void mian(String[] args)throws Exception
   {
   
   Runtime r= Runtime.getRuntime();
   
   r.exec("winmine.exe");//��һ����ִ���ļ�
   
   Process p=r.exec("winmine.exe");
   p.distory();//ɱ���ӽ���
   }
   }