
public class Vehicle {
	//variable declarations must end in semicolon
	int speed = 2000000000;
	byte wheels = 4;
	short weight = 2000;
	char fuel = 'D';
	boolean running = false;
	long serial = 81973212833458372L;
	
	//	float example = 100.123456789f;
	double fuelRemaining = 100.123456789;
	
	String make = "Toyota";
	
	Vehicle toy;
	
	//method
	//void is the return type, name of the method, then parameters
	void accelerate() {
		// method body
		int count = 0;
		System.out.println(count);
	}
	
	//constructor - initializes an object's state
	// calling the constructor creates an object at runtime using new keyword
	// Java provides default constructor if one isn't provided
	
	Vehicle() {
		speed = 0;
	}
	
	// Constructor overloading - defining multiple constructors
}
