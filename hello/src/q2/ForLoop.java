package q2;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		loop(10);
		loop(new int[] {1, 2, 3, 4, 5});
	}
	
	static void loop(int max) {
		// counter variable, condition, increment
		for (int i = 0; i < max; i++) {
			System.out.print(i);
		}
	}
	
	static void loop(int[] array) {
		// This will print each element in the array
		for(int num : array) {
			System.out.println(num);
		}
	}

}
