package ibmtal.otorepair.business.services;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.ServiceCardAddDto;

import ibmtal.otorepair.entity.ServiceCard;

public interface ServiceCardService {
Result<ServiceCard> getAll();
Result<ServiceCard> addServiceCard(ServiceCardAddDto serviceCardAddDto);
}
