package ibmtal.otorepair.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ibmtal.otorepair.business.services.CarService;
import ibmtal.otorepair.business.services.ServiceCardService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.ServiceCardAddDto;
import ibmtal.otorepair.entity.ServiceCard;


@RestController
@RequestMapping("/api/serviceCard")
public class ServiceCardController {
private ServiceCardService serviceCardService;

public ServiceCardController(ServiceCardService serviceCardService, CarService carService) {
	super();
	this.serviceCardService = serviceCardService;
}
	 
		 @PostMapping("/addModelWidthDto")
		 @GetMapping
		 public Result<ServiceCard>  addWidthDto(@RequestBody ServiceCardAddDto serviceCardAddDto){
		 	return this.serviceCardService.addServiceCard(serviceCardAddDto);
		 	

	 }
	 
}

