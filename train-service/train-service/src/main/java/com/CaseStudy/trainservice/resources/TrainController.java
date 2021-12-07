package com.CaseStudy.trainservice.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CaseStudy.trainservice.model.Trains;
import com.CaseStudy.trainservice.repository.TrainRepository;

@RestController
@RequestMapping("/trains")
public class TrainController {
	
	@Autowired
	private TrainRepository trainRepository;
	
	@PostMapping("/addTrain")
	public String saveTrain(@RequestBody Trains trainid) {
	trainRepository.save(trainid);
	return "Added train with id :  " + trainid.getTrainid();
    }
	
	@GetMapping("{trainid}")
	public Optional<Trains> getTrain(@PathVariable String trainid){
		return trainRepository.findById(trainid);
	}
		
	@DeleteMapping("/delete/{trainid}")
	public String deleteTrain (@PathVariable String trainid) {
		trainRepository.deleteById(trainid);
		return "Train deleted with id : "+trainid;
    }
	@PutMapping("/update/{trainid}")
	public Trains updateTrain(@PathVariable("trainid") String trainid,@RequestBody Trains t ) {
		t.setTrainid(trainid);
		trainRepository.save(t);
		return t;

	}
}