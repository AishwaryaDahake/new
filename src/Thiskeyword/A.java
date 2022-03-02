package Thiskeyword;

public class A {
	 public void m1()
	 {
		 System.out.println(this);
	 }

	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println(a);
		a.m1();
	}
}
