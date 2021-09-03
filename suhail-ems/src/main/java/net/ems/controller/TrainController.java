package net.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ems.model.Train;
import net.ems.repository.TrainRepository;

@RestController
@RequestMapping("/api/v2")
public class TrainController {
	
	@Autowired
	private TrainRepository trainRepository;
	
	// create a rest API 
	@GetMapping("/trains")
	public List<Train> getAllTrains(){
		return trainRepository.findAll();
	}
	// create a rest api
	@PostMapping("/trains")
	public Train createTrain(@RequestBody Train train) {
		return trainRepository.save(train);
	}
	
}
