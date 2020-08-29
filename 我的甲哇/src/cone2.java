
public class cone2 
{
	public interface Area
	{
		public abstract double area();
	}

	public interface Volume
	{
		public abstract double  volume();
	}

	public class Cone extends Object implements Area,Volume
	{
	
	
		 protected double r;
		 double hight;
		 public Cone(double cr,double ch)
		 {
		 this.r=cr;
		 this.hight=ch;
		 }
		 public double area()
		 {
			 return 3.1415*r*r+3.1415*r*Math.sqrt(r*r+hight*hight);
		 }
		 public double volume()
		 {
			 return 1/3*3.1415*r*r*hight;
		 }
	
		 public static void main(String args[])
		 {
			 Cone c = new Cone（3.0，4.0）；
			
			 System.out.print("圆柱体的面积是："+c.area());
			 System.out.print("圆锥体的体积是:"+c.volume());
			 
		 }
	
		 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	