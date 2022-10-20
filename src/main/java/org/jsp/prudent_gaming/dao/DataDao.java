package org.jsp.prudent_gaming.dao;

import java.util.Optional;

import org.jsp.prudent_gaming.dto.Bets_Details;
import org.jsp.prudent_gaming.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataDao 
{
	@Autowired
	DataRepository dataRepository;

	public Bets_Details saveAdmin(Bets_Details bets) {
		dataRepository.save(bets);
		return bets;
	}

	public Optional<Bets_Details> fetchBetsDetails(int id) {
		return dataRepository.findById(id);
	}

}
