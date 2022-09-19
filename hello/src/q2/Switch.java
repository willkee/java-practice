package q2;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchCase("A");
		switchCase("B");
		switchCase("C");
	}
	
	static void switchCase(String val) {
		switch(val) {
			case "A": {
				System.out.println("A");
				break;
			}
			case "B": {
				System.out.println("B");
				break;
			}
			default: {
				// default is a catch-all
				System.out.println("Default");
			}
		}
	}

}
