package ibmtal.otorepair.business.maneger;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.ServiceCardService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CarDao;
import ibmtal.otorepair.database.ServiceCardDao;
import ibmtal.otorepair.dtos.ServiceCardAddDto;

import ibmtal.otorepair.entity.ServiceCard;
@Service
public class ServiceCardManeger implements ServiceCardService{
private ServiceCardDao serviceCardDao;
private CarDao carDao;
@Autowired
public ServiceCardManeger(ServiceCardDao serviceCardDao, CarDao carDao) {
	super();
	this.serviceCardDao = serviceCardDao;
	this.carDao = carDao;
}
@Override
public Result<ServiceCard> getAll() {
	Result<ServiceCard> result=new Result<>();
    result.setData(new ArrayList<ServiceCard>(this.carDao.findAll(500)));
	return result;
}
@Override
public Result<ServiceCard> addServiceCard(ServiceCardAddDto serviceCardAddDto) {
    Result<ServiceCard> result=new Result<>();
    if (this.carDao.findById(serviceCardAddDto.getCar().isEmpty())) {
    	result.newError("Car", "Boş Geçilmez");
    }	
   if(result.isSuccess()) {
	   ServiceCard serviceCard=new ServiceCard();
	   serviceCard.setPrice(serviceCardAddDto.getPrice());
	   serviceCard.setServicedate(serviceCardAddDto.getServicedate());
	   serviceCard.setCar(this.carDao.findById(serviceCardAddDto.getCar()).get());
	   this.serviceCardDao.save(serviceCard);
	   result.getData().add(serviceCard);
   }
	return result;
}
}