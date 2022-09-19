
public class Shadow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		int returned = child.getX();
		System.out.print(returned);
	}

}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 5;
	
	// setter method
	public void setX(int x) {
		this.x = x;
	}
	
	
	// getter method
	public int getX() {
		return this.x;
	}
}