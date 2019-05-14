package com.tianjunwei.controller;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class HomeController {

	Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired 
	RestTemplate restTemplate;
	
	 @RequestMapping("tar")
	public String tar() throws InterruptedException, IOException { //service4 method
	 		logger.info("tar");
	        Random random = new Random();
	        int sleep= random.nextInt(1000);
	        TimeUnit.MILLISECONDS.sleep(sleep);
	        return " [service4 sleep " + sleep+" ms]";
	}
}