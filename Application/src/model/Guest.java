package model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Guest {
	
	private String name, birthDate, occupants, number;
	private LocalDate arrivalDate, departDate;
	
	public Guest(String name, String birthDate, Date arrivalDate, Date departDate, String occupants, String number) {
		this.name = name;
		this.birthDate = birthDate;
		this.arrivalDate = arrivalDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		this.departDate = departDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		this.occupants = occupants;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartDate() {
		return departDate;
	}

	public void setDepartDate(LocalDate departDate) {
		this.departDate = departDate;
	}

	public String getOccupants() {
		return occupants;
	}

	public void setOccupants(String occupants) {
		this.occupants = occupants;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "Name: " + name + "\nDates: " + arrivalDate + " to " + departDate + "\nOccupants: " + occupants + "\nNumber: " + number;
	}

}
