
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poppable obj1 = new Poppable();
		Poppable obj2 = new Balloon();
		Poppable obj3 = new Bubble();
		obj1.pop();
		obj2.pop();
		obj3.pop();
	}

}

class Poppable {
	public void pop() {
		System.out.println("Pop.");
	}
}

class Balloon extends Poppable {
	public void pop() {
		System.out.println("POP!");
	}
}

class Bubble extends Poppable {
	public void pop() {
		System.out.println("p");
	}
}