
public class Abstraction {

	public static void main(String[] args) {

//		Cannot instantiate shape because it is an abstract class
//		Shape shape = new Shape();

	}

}

abstract class Shape {
	abstract double area();
}

class Triangle extends Shape {
	double area() {
		return 0;
	}
}

class Square extends Shape {
	double area() {
		return 10;
	}
}
