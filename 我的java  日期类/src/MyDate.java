
public class MyDate {
	int year,month,day;
	void set(int y,int m,int d){
		year=y;
		month=m;
		day=d;
	}
	void set(MyDate d){
		set(d.year,d.month,d.day);
		
	}
	public String toString(){
		return year+"Äê"+month+"ÔÂ"+day+"ÈÕ";
		
	}
	public static void main(String arg[]){
		MyDate d1=new MyDate();
		d1.set(2012,10,27);
		MyDate d2=d1;
		System.out.println("d1:"+d1.toString()+",d2:"+d2.toString());
		d2.month=11;
		System.out.println("d1:"+d1+",d2:"+d2);
		d2=new MyDate();
		d2.set(d1);
		System.out.println("d1:"+d1+",d2:"+d2);
		
		
	}
	
	
}