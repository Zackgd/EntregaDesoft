package com.utn.TP_ApiRest.Controllers;

import com.utn.TP_ApiRest.Entities.Libro;
import com.utn.TP_ApiRest.Services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/libros")
public class LibroController extends  BaseControllerImpl<Libro, LibroServiceImpl>{
}
