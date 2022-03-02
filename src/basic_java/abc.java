package basic_java;


		public class abc
		{
			public static void m1()
			{
			System.out.println("in method");
			int a=20;
			System.out.println(a);
			int b=20;
			System.out.println(b);
			int c=a+b;
			System.out.println(c);
			
		    }
			

		public static void main(String[] args)

		{
			System.out.println("in main");
		abc a=new abc();
		a.m1();
		System.out.println("out main");
		
	}

}
