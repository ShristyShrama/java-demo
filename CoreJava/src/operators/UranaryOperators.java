package operators;

public class UranaryOperators {

	public static void main(String[] args) {
		
		int dishQuantity = 1;
		dishQuantity++;
		++dishQuantity;
		
		System.out.println("Dish Quantity is: "+dishQuantity);
		
		--dishQuantity;
		System.out.println("Dish Quantity Now is: "+dishQuantity);
		
		int totaldishes = dishQuantity++; // first it will assign the value then it will increase the value
		System.out.println("Total Dishes: "+totaldishes);
		System.out.println("Dish Quantity: "+dishQuantity);
		
		int totaldishes1 = ++dishQuantity; // first it will assign the value then it will increase the value
		System.out.println("Total Dishes: "+totaldishes1);
		System.out.println("Dish Quantity: "+dishQuantity);
		

	}

}
