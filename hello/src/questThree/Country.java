package questThree;

import java.util.HashMap;

public class Country {

	public static void main(String[] args) {
		HashMap<String, Citizen>citizens = new HashMap<String, Citizen>();
		
		citizens.put("5001", new Citizen("Brian"));
		citizens.put("4514", new Citizen("Diane"));
		citizens.put("5001", new Citizen("John"));
		
		System.out.println(citizens.get("5001").name);
		
		System.out.println(citizens.size());
		System.out.println(citizens.containsKey("5001"));
		System.out.println(citizens.containsValue(new Citizen("John")));
		System.out.println(citizens.entrySet()); // key value pairs
		System.out.println(citizens.keySet());
		System.out.println(citizens.values());
	}

}

class Citizen {
	String name;
	Citizen(String name) {
		this.name = name;
	}
}