package model;

public enum RoomStyle {
	
	Twin,
	Queen,
	x2Twin,
	x2Queen;
	
	
	public String toString() {
		switch(this) {
		case Twin: return "Single Twin";
		case Queen: return "Single Queen";
		case x2Twin: return "Double Twin";
		case x2Queen: return "Double Queen";
		
				
		}
		return "Queen";
	}

}
