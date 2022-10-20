package org.jsp.prudent_gaming.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bets_Details
{
@Id
private int id;
private int numbets;
private String game;
private double stake;
private double returns;
private int clientid;
private String date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumbets() {
	return numbets;
}
public void setNumbets(int numbets) {
	this.numbets = numbets;
}
public String getGame() {
	return game;
}
public void setGame(String game) {
	this.game = game;
}
public double getStake() {
	return stake;
}
public void setStake(double stake) {
	this.stake = stake;
}
public double getReturns() {
	return returns;
}
public void setReturns(double returns) {
	this.returns = returns;
}
public int getClientid() {
	return clientid;
}
public void setClientid(int clientid) {
	this.clientid = clientid;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}

}
