package org.jsp.prudent_gaming.service;

import org.jsp.prudent_gaming.ResponseStructure;
import org.jsp.prudent_gaming.dao.DataDao;
import org.jsp.prudent_gaming.dto.Bets_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DataService
{
@Autowired
DataDao datadao;
	
	public ResponseStructure<Bets_Details> saveBets(Bets_Details bets) {
		ResponseStructure < Bets_Details > structure = new ResponseStructure < Bets_Details > ( ) ;
		structure.setData ( datadao.saveAdmin ( bets ) ) ;
		structure.setMessage ( "Saved" ) ;
		structure.setStatusCode ( HttpStatus.CREATED.value ( ) ) ;
		return structure ;
	}

	public ResponseStructure<Bets_Details> fetchBets(int id) {
		ResponseStructure < Bets_Details > structure = new ResponseStructure < Bets_Details > ( ) ;
		structure.setData ( datadao.fetchBetsDetails(id).get() ) ;
		structure.setMessage ( "Fetched" ) ;
		structure.setStatusCode ( HttpStatus.FOUND.value ( ) ) ;
		return structure ;
	}

}
