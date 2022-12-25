package com.example.witch.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.witch.controller.services.Fibo1;
import com.example.witch.controller.services.FiboAlgorithm;
import com.example.witch.controller.services.PopulatedService;
import com.example.witch.controller.services.WitchAlgorithm;
import com.example.witch.request.TwoPeople;

@RequestMapping("/api")
@RestController
public class Test {
	
	
	@Autowired
	private PopulatedService service;
	
	@PostMapping("/average")
	public double allAccess(@Valid @RequestBody TwoPeople people) {
		WitchAlgorithm wicthAlgorithm = new WitchAlgorithm();
		List<Integer> mapData = service.getMapData();
		Integer numberPersonA = wicthAlgorithm.getNumberOfPeopleKillOnYear(mapData, people.getYearOfDatePersonA() - people.getAgeOfDatePersonA() );
        Integer numberPersonB = wicthAlgorithm.getNumberOfPeopleKillOnYear(mapData, people.getYearOfDatePersonB() - people.getAgeOfDatePersonB() );
        return  wicthAlgorithm.Average(numberPersonA, numberPersonB);		 
	}
	
}
