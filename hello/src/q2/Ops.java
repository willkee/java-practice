package q2;

public class Ops {
	String instance = "var";
	
	// In Java "=" is assignment
	// In Java, "==" is comparison
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math Operations
		int add = 2 + 2;
		int sub = 2 - 2;
		int mul = 2 * 2;
		int div = 2 / 2;
		
		int remainder = 2 % 2;
//		System.out.println(add);
//		System.out.println(sub);
//		System.out.println(mul);
//		System.out.println(div);
//		System.out.println(remainder);
//		System.out.println(5 % 3);
		
		
		// Relational Operators
		
		// all these are true.
//		boolean equal = 5 == 5;
		boolean notEqual = 5 != 4;
		boolean greater = 5 > 4;
		boolean less = 4 < 5;
		boolean ge = 5 >= 4;
		boolean le = 4 <= 5;
		
		// Conditional operators:
		boolean holiday = false;
		boolean weekend = true;
		boolean work = true;
		
//		if (holiday | weekend & !work) {
//			// day off
//			// pipe symbol is a OR operator
//			System.out.println("Day off");
//		}
//		
//		// short circuit, common practice
//		if (holiday || weekend && !work) {
//			// day off
//			// pipe symbol is a OR operator
//			System.out.println("Day off");
//		}
		

		int x = 0;
		System.out.println(++x);
		int y = 0;
		System.out.println(y++);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x+=5);
		System.out.println(x-=9);
		
		// +=, 
		}
		
	
}
