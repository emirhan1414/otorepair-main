package ibmtal.otorepair.database;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.otorepair.entity.Car;
import ibmtal.otorepair.entity.ServiceCard;

public interface CarDao extends JpaRepository<Car, Integer>{

	

	Collection<? extends ServiceCard> findAll(int i);

	boolean findById(boolean empty);

	Car findById(String car);

}
