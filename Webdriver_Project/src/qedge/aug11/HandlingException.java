package qedge.aug11;

public class HandlingException {

	public static void main(String[] args) {
		try {
		int a =789,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		int x=87675,y=98,z;
		z=x/y;
		System.out.println(z);
	}

}
