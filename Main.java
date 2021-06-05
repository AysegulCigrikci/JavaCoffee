import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
public class Main {

	public static void main(String[] args) {
			
		Customer customer = new Customer();
		customer.setFirstName("ay�eg�l");
		customer.setLastName("���r�k��");
		customer.setDateOfBirth(new GregorianCalendar(2002, 04 , 10).getTime());
		customer.setNationalityId("15440280172");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
	}
}
