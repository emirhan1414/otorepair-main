package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.services.CustomerService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CustomerUpdateDto;
import ibmtal.otorepair.entity.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
private CustomerService customerService;
@Autowired
public CustomerController(CustomerService customerService) {
	super();
	this.customerService = customerService;
}
@PostMapping("/getAll")
@GetMapping
public Result<Customer> addCustomerApi(@RequestBody Customer customer){
	return this.customerService.addCustomer(customer);
}
@PostMapping("/updateCustomer")
@GetMapping
public Result<Customer> updateBrand(@RequestBody CustomerUpdateDto customerUpdateDto){
	return this.customerService.updateCustomer(customerUpdateDto);
	}

}
