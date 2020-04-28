package com;

public class DoctorAlreadyExistException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Doctor Already Exist !! Please recheck before adding new Doctor.";
	}

}
