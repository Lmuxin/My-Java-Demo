


public interface Volume {   //定义接口
 public abstract double getVolume();
}
 
public class Circle {    //定义圆形类
 double r;
 public Circle(double r){
     this.r=r;
    }
    public double getS(){   //面积
     return Math.PI*r*r;
    }
    public double getL(){  //周长
     return 2*Math.PI*r;
    }
}
 
public class Cylinder extends Circle implements Volume{    //定义圆柱体
    double h;
 public Cylinder(double r,double h){
  super(r);
  this.h=h;  
 } 
 public double getArea(){   //表面积
  return h*getL()+2*getS();
 }
 public double getVolume(){  //体积
  return h*getS();
 }
 
 public static void main(String[] args) {
  Cylinder c1=new Cylinder(5,10);
  System.out.println("表面积:"+c1.getArea());
  System.out.println("体积:" +c1.getVolume());
 }
/*public interface Inter {
	public Double getV(Double r,Double h);
}

import java.util.Scanner;

public class Demo implements Inter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入圆锥底面圆的半径：");
		double r=in.nextDouble();
		System.out.println("请输入圆锥的高：");
		double h=in.nextDouble();
		Demo de = new Demo();
		de.getV(r, h);
	}

	@Override
	public Double getV(Double r, Double h) {
		double v;
		v=(1d/3)*(Math.PI*r*r)*h;
		System.out.println("圆锥的体积v="+v);
		return v;
	}
}
/*public abstract interface Area
	{
		public abstract double area();
	}
	public interface Volume
	{
		
	   public abstract double volume();
	}
	
public class cone implements Area,Volume
	{
	 protected
		double r;
     double hight;
     cone(double cr,double ch)
     {
    	this.r=cr;
    	 this.hight=ch;
     }
   
public double area()
{
	return 3.1415*r*r+2*3.1415*r*sqrt(r*r+hight*hight);
}
public double volume()
{
	return 1/3*3.14*r*r*hight;
}


public static void main(String args[])
	{
		cone c=new cone(3,6);
		Area ar=c;
		c.area();
		
	}*/















