package javaProject;

class A extends Thread
{
	@Override
	public void run()
	{
		int i = 0;
		while(i<1000)
		{
			System.out.println("hello1");
			i++;
		}
		
	}
}
class B extends Thread
{
	int i = 0;
	@Override
	public void run()
	{
		while(i<1000)
		{
			System.out.println("hello");
			i++;
		}
	}
}
public class Threadsandoverrinde
{
	public static void main(String[]args)
	{
		A A1 = new A();
		B B1 = new B();
		A1.start();
		B1.start();
	}
}
