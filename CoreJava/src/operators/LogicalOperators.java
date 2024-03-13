package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		//&&, ||, !
		
		boolean internet = true;
		boolean gps = true;
		System.out.println("Can I navigate to google maps: "+(internet && gps));
		
		int promoCode = 2400;
		int amount = 5000;
		System.out.println("Can I get the discount? "+( (promoCode == 2400) && (amount > 3000) ));
		
		String phoneNumber = "";//9999912345
		String email = "";//john@gmail.com
		System.out.println("Can I login? "+( (phoneNumber.length()!=0) || (email.length()!=0) ));
		
		System.out.println("! of Internet: "+(!internet));
		

	}

}
