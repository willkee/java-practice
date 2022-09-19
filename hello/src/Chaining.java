
public class Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaDeveloper dev = new JavaDeveloper("Java");
	}

}

class Employee {
	String name = "John Doe ";
	
	public Employee() {
		System.out.println("Employee");
	}
}

class JavaDeveloper extends Employee {
	String language;
	
	public JavaDeveloper() {
		super();
		// Whether super() is included or not, Employee class is 
		// implicitly called.
		
		System.out.println(name + "Java Developer");
	}
	
	public JavaDeveloper(String language) {
		this();
		this.language = language;
		System.out.println(language);
	}
}