package model;

public class Guest {
	
	private String name, birthDate, arrivalDate, departDate, occupants, number;
	
	public Guest(String name, String birthDate, String arrivalDate, String departDate, String occupants, String number) {
		this.name = name;
		this.birthDate = birthDate;
		this.arrivalDate = arrivalDate;
		this.departDate = departDate;
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

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartDate() {
		return departDate;
	}

	public void setDepartDate(String departDate) {
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
		return "Name: " + name + "\nDates: " + arrivalDate + " to " + departDate;
	}

}
