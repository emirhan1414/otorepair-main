package ibmtal.otorepair.database;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import ibmtal.otorepair.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{

	Optional<Customer> findById(Customer customer);

}
