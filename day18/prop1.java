import java.util.*;
class SystemDemo
{
public static void  main(String[] args)
{  
          Properties prop=System.getProperties();
/*
��ΪProperties ��Hashtable������,Ҳ����Map���������,��ô�Ϳ���ͨ��map�ķ���ȡ���ü��ϵ�Ԫ��
*/
for(Object obj:prop.keySet())
{
String values=(String)prop.get(obj);
System.out.println(values);
}
    }

       }
  
