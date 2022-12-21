package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.services.CarService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CarAddDto;
import ibmtal.otorepair.entity.Car;

@RestController
@RequestMapping("/api/car")

public class CarController {
	private CarService carService;
	@Autowired
	public CarController(CarService carService) {
		super();
		this.carService = carService;

	}
	@PostMapping("/addCarWidthDto")
	@GetMapping
	public Result<Car> addWidthDto(@RequestBody CarAddDto carAddDto){
		return this.carService.addCar(carAddDto);
	}
}


