package Thiskeyword;

public class C {
	
	public C()//default constuctor
	{
		System.out.println("hello");
	}
	
	public C(int i)//parameterized constructor
	{
		this();
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		C c=new C(10);
	}

}
