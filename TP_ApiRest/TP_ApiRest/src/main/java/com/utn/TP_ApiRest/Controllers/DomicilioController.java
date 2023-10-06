package com.utn.TP_ApiRest.Controllers;

import com.utn.TP_ApiRest.Entities.Domicilio;
import com.utn.TP_ApiRest.Services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}
