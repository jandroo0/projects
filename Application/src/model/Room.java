package model;

public class Room {
	
	private int roomNumber;
	private RoomStyle roomStyle;
	
	private Guest guest;
	private Boolean vacant;
	
	public Room(int roomNumber, RoomStyle roomStyle) {
		this.roomNumber = roomNumber;
		this.roomStyle = roomStyle;
		this.vacant = true;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomStyle getRoomStyle() {
		return roomStyle;
	}

	public void setRoomStyle(RoomStyle roomStyle) {
		this.roomStyle = roomStyle;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Boolean getVacant() {
		return vacant;
	}

	public void setVacant(Boolean vacant) {
		this.vacant = vacant;
	}
	

}
