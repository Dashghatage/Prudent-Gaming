package org.jsp.prudent_gaming.controller;

import java.util.List;

import org.jsp.prudent_gaming.ResponseStructure;
import org.jsp.prudent_gaming.dto.Bets_Details;
import org.jsp.prudent_gaming.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@Autowired
	DataService dataService;

	@PostMapping("/bets")
	public ResponseStructure<Bets_Details> saveBets(@RequestBody List<Bets_Details> bets) {
		for (Bets_Details bet : bets) {
			dataService.saveBets(bet);
		}
		return null;
	}

	@GetMapping("/bets/{id}")
	public ResponseStructure<Bets_Details> fetchBets(@PathVariable int id) {
		return dataService.fetchBets(id);
	}

}
