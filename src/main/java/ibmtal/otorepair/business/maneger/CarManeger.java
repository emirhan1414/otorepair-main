package ibmtal.otorepair.business.maneger;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.CarService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CarDao;
import ibmtal.otorepair.database.CustomerDao;
import ibmtal.otorepair.dtos.CarAddDto;
import ibmtal.otorepair.entity.Car;


@Service
public class CarManeger implements CarService{
private CarDao carDao;
private CustomerDao customerDao;
@Autowired
public CarManeger(CarDao carDao, CustomerDao customerDao) {
	super();
	this.carDao = carDao;
	this.customerDao = customerDao;
}

@Override
public Result<Car> getAll() {
	Result<Car> result=new Result<>();
	result.setData(new ArrayList<Car>(this.carDao.findAll()));
	return result;
}
@Override
public Result<Car> addCar(CarAddDto addDto) {
	Result<Car> result=new Result<>();
	if (this.customerDao.findById(addDto.getBrand()).isEmpty()) {
		result.newError("Customer", "Müşteri kaydı bulunamadı");
  }
	if(result.isSuccess()) {
       Car car=new Car();
       car.setPlaka(addDto.getPlaka());
       car.setBrand(addDto.getBrand());
       car.setModel(addDto.getModel());
       car.setColor(addDto.getColor());
       car.setCustomer(this.customerDao.findById(addDto.getCustomer()).get());
       this.carDao.save(car);
       result.getData().add(car);
	}
 	return result;
 		
 	}
}


