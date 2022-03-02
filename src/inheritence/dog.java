package inheritence;

public class dog extends animal

{
	public void m3()
	{
		System.out.println("stand");
		
	}

	public void m4()
	{
		System.out.println("sit");
	}
	
	public static void main(String[] args) 
	{
		dog b=new dog();
		b.m1();
		b.m3();
	}
}
