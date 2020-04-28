package com;

public class Room 
{
	int roomNo;
	String roomType;
	boolean roomOccupied;
	
	Room(int roomNo , String roomType)
	{
		this.roomNo = roomNo;
		this.roomType=roomType;
		
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public boolean isRoomOccupied() {
		return roomOccupied;
	}

	public void setRoomOccupied(boolean roomOccupied) {
		this.roomOccupied = roomOccupied;
	}
	
}
