package qedge.aug10;

public class ReturnTypeDemo {
	public static void add(int a,int b)
	{
		a=345;
		b=98;
		int c=a+b;
		System.out.println(c);
	}
	public static String verify_String(String str1,String str2)
	{
		String res = "";
		if(str1.equalsIgnoreCase(str2))
		{
			res="Both Strings are equal";
		}
		else
		{
			res="Both Strings are not equal";
		}
		return res;
	}
	public static boolean compare_Values(int x,int y)
	{
		if(x==y)
			return true;
		else
			return false;
			
	}

	public static void main(String[] args) {
		ReturnTypeDemo.add(23, 56);
		String result1 = ReturnTypeDemo.verify_String("Hello", "hello");
		boolean result2 = ReturnTypeDemo.compare_Values(87, 96);
		System.out.println(result1);
		System.out.println(result2);
	}

}
