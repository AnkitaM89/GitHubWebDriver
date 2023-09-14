package qedge.aug10;

public class NonStaticDemo {
	//Non static variable
	int a,b,c;
	double x,y,z;
	
	public void add()
	{
		a=345;
		b=98;
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		a=3456;
		b=98;
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		a=346;
		b=98;
		c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		x=3456;
		y=98;
		z=a/b;
		System.out.println(z);
	}
	public static void main(String[] args) {
		NonStaticDemo obj = new NonStaticDemo();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

	}

}
