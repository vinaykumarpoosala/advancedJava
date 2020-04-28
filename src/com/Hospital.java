package com;

public interface Hospital 
{
	int addDoctor(Doctor doctor) throws DoctorAlreadyExistException;
	int addRoom(Room room) throws RoomNotAvailableException;
	int allocateRoom(String str) throws RoomNotAvailableException;
}
