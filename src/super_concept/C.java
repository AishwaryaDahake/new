package super_concept;

public class C extends B
{
	public C()
	{
		super();
		System.out.println("c constructor");
	}
public void m5()
{
	System.out.println("method5");
}
public static void main(String[] args) 
{
	C c=new C();
	//object of c class
}


}
