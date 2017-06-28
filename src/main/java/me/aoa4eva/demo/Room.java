package me.aoa4eva.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	@NotEmpty
	private String shortDescription;
	
	private String Rented; 
	/**
	 * @return the shortDescription
	 */
	
	private String Address; 
	
	private String City; 
	
	private String USAState; 
	
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the rented
	 */
	public String getRented() {
		return Rented;
	}

	/**
	 * @param rented the rented to set
	 */
	public void setRented(String rented) {
		Rented = rented;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	/**
	 * @return the uSAState
	 */
	public String getUSAState() {
		return USAState;
	}

	/**
	 * @param uSAState the uSAState to set
	 */
	public void setUSAState(String uSAState) {
		USAState = uSAState;
	}



}
