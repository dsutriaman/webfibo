package com.example.witch.controller.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PopulatedService implements CommandLineRunner {
	
	@Value("${numberOfData}")
    private Integer numberOfData;
	
	private List<Integer> mapData = new ArrayList<>();
	
	public List<Integer> getMapData() {
		return mapData;
	}



	@Override
	public void run(String... args) throws Exception {
		FiboAlgorithm algorithm = new Fibo1();
		WitchAlgorithm wicthAlgorithm = new WitchAlgorithm(algorithm);
		mapData.addAll(algorithm.init(numberOfData));
	}


}
