  /*
  ������ ,��Ϊ��������Ĳ���Ч�ʶ���,�����ڴ���������֮ǰ,����Ҫ����������
  �û��������ṩ��һ����ƽ̨�Ļ��з�
  */
  
  
   import  java.io.*;
    class BufferDemo
    {
    
        public static void main(String[] args)throws IOException
        {
            //����һ���ַ�д��������
            
            FileWriter fw=new FileWriter("buf.txt");
            
            //Ϊ������ַ�д������Ч��,�����˻��弼��
            //ֻҪ����Ҫ�����Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯������
            BufferedWriter bufw=new BufferedWriter(fw);
            
            bufw.write("abced");//   windows��  \r\n�ǻ���   linux�� \n�ǻ���
            bufw.newLine();//����,��windows��linux�¶�����
                
            //ֻҪ�õ���������Ҫ�ǵ�ˢ��
            bufw.flush(); 
            
            //��ʵ�رջ�����,�����ڹرջ������е�������
            bufw.close();
        
        }
    
    }