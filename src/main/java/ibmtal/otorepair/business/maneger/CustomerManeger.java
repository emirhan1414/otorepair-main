package ibmtal.otorepair.business.maneger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.CustomerService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CustomerDao;
import ibmtal.otorepair.dtos.CustomerUpdateDto;
import ibmtal.otorepair.entity.Customer;

@Service
public class CustomerManeger implements CustomerService {
	private CustomerDao customerDao;
	@Autowired
	public CustomerManeger(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Result<Customer> addCustomer(Customer customer) {
		Result<Customer> result=new Result<>();
		if(customer.getName().isEmpty()) {
			result.newError("name", "boş geçilemez");
		}
		if(customer.getName().length()>30) {
			result.newError("name ", "30 Karakterden fazla olamaz");
		}
		if(result.isSuccess()) {
			this.customerDao.save(customer);
		}
		return result;
	}

	@Override
	public Result<Customer> updateCustomer(CustomerUpdateDto customerUpdateDto) {
		Result<Customer> result=new Result<>();
		Customer customer=new Customer();
		if(this.customerDao.findById(customerUpdateDto.getId()).isEmpty()) {
			result.newError("id", "id numarasına ait Marka Bulunamdı");
		}
		if(result.isSuccess()==true) {
			customer=this.customerDao.findById(customerUpdateDto.getId()).get();
			customer.setName(customerUpdateDto.getName());
			customer.setPhone(customerUpdateDto.getPhone());
			customer.setSurname(customerUpdateDto.getSurname());
			this.customerDao.save(customer);
		}
		return result;
	}
		

}
