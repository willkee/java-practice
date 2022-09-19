
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Interfaces can't be instantiated
//		Drawable d = new Drawable();
	}

}

interface Drawable {
	
	// public abstract void draw();
	// public and abstract are implied
	
	void draw();
}


interface Colorable extends Drawable {
	void color();
}

// Can implement multiple interfaces

class Rectangle implements Drawable, Runnable {
	public void draw() {}
	public void run() {}
}

class Circle implements Colorable {
	public void color() {}
	public void draw() {}
}