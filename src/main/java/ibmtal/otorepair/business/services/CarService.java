package ibmtal.otorepair.business.services;



import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CarAddDto;
import ibmtal.otorepair.entity.Car;

public interface CarService {
  ibmtal.otorepair.core.result.Result<Car> getAll();
  Result<Car> addCar(CarAddDto addDto);
  
}
