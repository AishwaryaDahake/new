package basic_java;

public class Swaptwonos 
{
	public static void main(String[] args) 
	{
		int first=25,second=22;
		System.out.println("before swap");
		System.out.println("first no=" +first);
		System.out.println("second no=" +second);
		
		int c=first;
		first=second;
		second=c;
		
		System.out.println("After swap");
		System.out.println("first no=" +first);
		System.out.println("second no=" +second);
		
		
	}

}
