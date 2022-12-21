package ibmtal.otorepair.business.services;



import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CustomerUpdateDto;
import ibmtal.otorepair.entity.Customer;

public interface CustomerService {
 ibmtal.otorepair.core.result.Result<Customer> addCustomer(Customer customer);
 Result<Customer> updateCustomer(CustomerUpdateDto customerUpdateDto);
}
