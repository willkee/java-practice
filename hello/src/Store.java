
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reference type is Furniture
		// object type is Chair
		
		Furniture chair = new Chair();
		Furniture table = new Table();
		
		sell(chair);
		sell(table);
	}
	
	public static void sell(Furniture furn) {
		System.out.println(furn);
	}

}

class Furniture {}
class Chair extends Furniture {}
class Table extends Furniture {}