package qedge.aug10;

public class StaticDemo {
	//Static global variables
	static int a,b,c;
	static double x,y,z;
	public static void add()
	{
		a=345;
		b=98;
		c=a+b;
		System.out.println(c);
	}
	public static void sub()
	{
		a=3456;
		b=98;
		c=a-b;
		System.out.println(c);
	}
	public static void mul()
	{
		a=346;
		b=98;
		c=a*b;
		System.out.println(c);
	}
	public static void div()
	{
		x=3456;
		y=98;
		z=a/b;
		System.out.println(z);
	}
	public static void main(String[] args) {
		StaticDemo.add();
		StaticDemo.sub();
		StaticDemo.mul();
		StaticDemo.div();
		
	}

}
