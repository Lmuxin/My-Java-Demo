/*
     ���� :�ͻ��˲����ϴ�ͼƬ
   
     
     */
     
     /*
     �ͻ���
     1/����˵�
     2.��ȡ�ͻ������е�ͼƬ����
     3.ͨ��socket����������ݷ��������
     4.��ȡ����˷�����Ϣ
     5.�ر�
     
     
     Ϊ�˿����ö���ͻ���ͬʱ�������ʷ����,�������þ��ǽ�ÿ���ͻ��˷�װ��һ�������߳���,�����Ϳ���ͬʱ�������ͻ�������
     */
     
     /*��ζ����߳�?
     ֻҪ��ȷ��ÿһ���ͻ���Ҫ�ڷ����ִ�еĴ��뼴��,���ô������run������
     

     */ 
     
      import java.io.*; 
    import java.net.*; 
       
   
       class   PClient5
    {
        public static void main(String[] args) throws Exception
        {  
              if(args.length!=1)
              {
                System.out.println("��ѡ��һ��jpgͼƬ");
                return;
                
              }
        
        
           File file=new File(args[0]);
            
              if(!(file.exists() && file.isFile()))//�������һ��Сð��,��Ȼ���˼���Сʱ���Ҳ�����,�Ա�Դ����һ����iһ��,��ô�Ϳ�������,Ϲ�� fuck
              {
                  System.out.println("���ļ�������,Ҫô����,Ҫô�����ļ�");
                  return;
              
              }
              
              
              
              
           
              
             if(!file.getName().endsWith(".jpg"))
              {
                 System.out.println("ͼƬ��ʽ����,������ѡ��");
                 return;
              
              }
           
            if(file.length()>1024*1024*5)
            {
            System.out.println("�ļ�����,û������");
            return;
            }
  
             Socket s=new Socket("192.169.1.255",10007);
                
                FileInputStream fis=new FileInputStream(file);
                OutputStream out=s.getOutputStream();
                
             byte[] buf=new byte[1024];
             int len=0;

             while((len=fis.read(buf))!=-1)
             {

               out.write(buf,0,len);
                            
             }
             //���߷���������Ѿ�д��
             s.shutdownOutput();
            InputStream in=s.getInputStream();
            byte[] bufin=new byte[1024];
            int num=in.read(bufin);
            
           
            System.out.println(new String(bufin,0,num));
            
            fis.close();
              s.close();
        }

    }  
    
    
   
  
    
    
  /*
    
    import java.io.*;
import java.net.*;
class  PicClient
{
	public static void main(String[] args)throws Exception 
	{
		if(args.length!=1)
		{
			System.out.println("��ѡ��һ��jpg��ʽ��ͼƬ");
			return ;
		}




		File file = new File(args[0]);
		if(!(file.exists() && file.isFile()))
		{
			System.out.println("���ļ������⣬Ҫô�����ڣ�Ҫô�����ļ�");
			return ;

		}

		if(!file.getName().endsWith(".jpg"))
		{
			System.out.println("ͼƬ��ʽ����,������ѡ��");
			return ;
		}

		if(file.length()>1024*1024*5)
		{
			System.out.println("�ļ�����û������");
			return ;
		}
		



		Socket s = new Socket("192.168.1.254",10007);

		FileInputStream fis = new FileInputStream(file);

		OutputStream out = s.getOutputStream();

		byte[] buf = new byte[1024];

		int len = 0;

		while((len=fis.read(buf))!=-1)
		{
			out.write(buf,0,len);
		}

		//���߷����������д��
		s.shutdownOutput();

		InputStream in = s.getInputStream();

		byte[] bufIn = new byte[1024];

		int num = in.read(bufIn);
		System.out.println(new String(bufIn,0,num));

		fis.close();
		s.close();
	}
}
*/
 
    
     class PicThread implements Runnable
     {
     
        private Socket  s;
        PicThread(Socket s)
        {
           this.s=s;
  
        }
        
        
        public void run()
        {
        
            int count=1;
             String ip=s.getInetAddress().getHostAddress();
          try 
            {
        
                System.out.println(ip+".....connected");
               InputStream in=s.getInputStream();
               
               File dir =  new File("d:\\pic");
               
               
               File file=new File(dir,ip+"("+(count)+")"+".jpg");//192.168.1.254(1)
               
               
               while(file.exists())
               
               
               file=new File(dir,ip+"("+(count++)+")"+".jpg");//192.168.1.254(1)
               
               
                 FileOutputStream fos=new FileOutputStream(file);
                 
                 byte[] buf=new byte[1024]; 
                  
                  int len=0;
                  while((len=in.read(buf))!=-1)
                  {
                     fos.write(buf,0,len);
                  
                  }
                 OutputStream out=s.getOutputStream();
                 out.write("�ϴ��ɹ�".getBytes());
                 
     
                 fos.close();
                  s.close();
                
            }
                 catch(Exception e)
                   {
                     throw new RuntimeException(ip+"�ϴ�ʧ��");
                   }
        }
     
     }
     

    
       
    /*
       �����  
    
    
    
    */
        class Server5
    {
        public static void main(String[] args)throws Exception  
        {  
            
             ServerSocket ss=new ServerSocket(10000);
             
             while(true)
             {
               Socket s=ss.accept();
              new Thread(new PicThread(s)).start();
              
              }
              
        }
 
    }