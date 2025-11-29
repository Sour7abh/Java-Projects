package demo;

public class TypeCasting {

	public static void main(String[] args) {
			
			// implicit conversion
			
			System.out.println("Implicit type casting");
			
			char a='A';
			System.out.println("Value of a:"+a);
			
			int b=a;
			System.out.println("Value of b:"+b);
			
			float c=a;
			System.out.println("Value of c:"+c);
			
			long d=a;
			System.out.println("Value of d:"+d);
			
			double f=a;
			System.out.println("value of f:"+f);
			
			System.out.println("\n");
			
			System.out.println("Explicit type casting");
			// explicit conversion:
			
			double x=45.5;
			int y = (int)x;
			
			System.out.println("Value of x:"+x);
			System.out.println("Value of y:"+y);

	}

}
