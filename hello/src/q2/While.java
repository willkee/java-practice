package q2;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop(false);
	}
	
	static void loop() {
		boolean running = true;
		
		while (running) {
			System.out.println("Running");
			running = check();
		}
	}
	
	static boolean check() {
		if (Math.random() < 0.5) {
			return false;
		} else {
			return true;
		}
	}
	
	// Do While
	
	static void loop(boolean running) {
		// Do while loop will run the "do" block of code, then checks to see if it will run
		do {
			System.out.println("Running");
		} while (running);
	}

}
