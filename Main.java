import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
public class Main {

	public static void main(String[] args) {
			
		Customer customer = new Customer();
		customer.setFirstName("ayþegül");
		customer.setLastName("çýðrýkçý");
		customer.setDateOfBirth(new GregorianCalendar(2002, 04 , 10).getTime());
		customer.setNationalityId("15440280172");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
	}
}
