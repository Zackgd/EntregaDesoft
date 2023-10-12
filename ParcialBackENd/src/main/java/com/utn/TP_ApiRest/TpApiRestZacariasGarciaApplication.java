package com.utn.TP_ApiRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.utn.TP_ApiRest")
public class TpApiRestZacariasGarciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpApiRestZacariasGarciaApplication.class, args);
		System.out.println(("Api Funcionando"));
	}

}
