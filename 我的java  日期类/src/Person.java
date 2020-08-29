
/*public class MyDate{
	private int year,month,day;
	
	public MyDate(int year,int month,int day){
		
		this.set(year,month,day);
	}
	public void set(int year,int month,int day)
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
}*/
public class Person {
			public String name;
			public MyDate birthday;
			public  String sex,province,city;
			private static int count=0;
public Person(String name,MyDate birthday,String sex,String province,String city)
{
	this.set(name,birthday,sex,province,city);
	count++;
	}

public Person(String name,MyDate birthday)
{
	this(name,birthday,"","","");
	
}

public Person(){
	this("",null);
	
}

public Person(Person p){
	
	this(p.name,p.birthday,p.sex,p.province,p.city);
	
	}
public class MyDate{
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year,int month,int day){
		
		this.set(year,month,day);
	}
	public void set(int year,int month,int day)
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
}
public void finalize()
{
	System.out.println("释放对象("+this.toString()+")");
	Person.count--;
	
}
public static void howmany(){//函数名如果写成how many 就提示错误，难道空个格都不许嘛
	System.out.print(Person.count+"个Person 对象");
	}
public void set(String name,MyDate birthday,String sex,String province,String city){
	this.name=name==null?"":name;
	this.birthday=birthday;
	this.sex=sex==null?"":sex;
	this.province=province==null?"":province;
	this.city=city==null?"":city;
	
}
public String toString(){
	return name+"，"+(birthday==null?"":birthday.toString())+","+sex+","+province+","+city;
}

public static void main(String args[])
{   MyDate d=new MyDate(1994,3,15);
	Person p1=new Person("李晓明",new MyDate(1994,3,15));
	Person p2=new Person(p1);
	Person.howmany();
	System.out.println("p1:"+p1+";p2:"+p2+"\np1==p2?"+(p1==p2)+":p1.name==p2.name?"+(p1.name==p2.name)+"," +
			"p1.birthday==p2.birthday?"+(p1.birthday==p2.birthday));
	p2.name="张"+p2.name.substring(1);
	
	
	System.out.println("p1:"+p1+",p2；"+p2);
	p1.finalize();
	Person.howmany();
}
}
	
	





















	













