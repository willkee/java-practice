
public class Farmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pickle pickle = new Pickle();
		pickle.grow();
	}

}

class Cucumber {
	double calories;
	
	public void grow() {}
}

// class Pickle extends Cucumber, Salad  <-- invalid, will not compile
class Pickle extends Cucumber {
	public Pickle() {
		// inheriting calories from parent class
		calories = calories * 0.70;
	}
}

// You can only extend ONE class in Java
class Salad {
	
}