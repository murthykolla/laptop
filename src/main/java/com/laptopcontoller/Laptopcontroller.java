package com.laptopcontoller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptopinfo.Laptop;
import com.laptopservice.LaptopService;

@RestController
//@Controller
public class Laptopcontroller {
	private static final Logger LOGGER = Logger.getLogger(Laptopcontroller.class.getName());
	// autowire the CustomerService
	@Autowired
	private LaptopService laptopservice;

	// add mapping for GET /customers
	@GetMapping("/lap")
	public List<Laptop> getlaptop() {
		LOGGER.info("Logger Name: "+laptopservice.getlaptop());
		//System.out.println("--------------------->>>"+laptopservice.getlaptop());
		return laptopservice.getlaptop();

	}

}
