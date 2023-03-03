import com.user.*;
public class CompanyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer user = new Customer("moni", "gatti", "mg@gmail.com");
		
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.createUsername());
		
		Manager manager = new Manager("mario", "rossi", "mr@gmail.com");
		String usr = manager.createUsername();
		System.out.println(usr);


	}

}
