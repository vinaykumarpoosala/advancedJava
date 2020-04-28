package com;

public class RoomNotAvailableException extends Exception {
	@Override
	public String getMessage() {
		return "Currently Room is not available. It is already occupied.";
	}

}
