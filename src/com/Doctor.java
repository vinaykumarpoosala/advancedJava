package com;

public class Doctor
{

	String doctorName;
	double consulationCharge;
	String specialization;
	public Doctor(String doctorName, double consulationCharge, String specialization) {
		super();
		this.doctorName = doctorName;
		this.consulationCharge = consulationCharge;
		this.specialization = specialization;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public double getConsulationCharge() {
		return consulationCharge;
	}
	public void setConsulationCharge(double consulationCharge) {
		this.consulationCharge = consulationCharge;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
