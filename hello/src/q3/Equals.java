package q3;

public class Equals {
	public static void main(String[] args) {
		Pizza one = new Pizza();
        Pizza two = new Pizza();

        one.size = 14;
        one.topping = "Pepperoni";
        two.size = 14;
        two.topping = "Cheese";
        System.out.println(one == two); // bad practice
        System.out.println(one.equals(two));
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
	}
}

class Pizza {
    int size = 0;
    String topping = null;

    public int hashCode() {
        if (topping != null) {
            return size * topping.hashCode();
        } else {
            return size;
        }
    }

    public boolean equals(Object o) {
        Pizza other = (Pizza) o;
        if (this.size == other.size) {
            if (this.topping == other.topping) {
                return true;
            }
        }
        return false;
    }
}
