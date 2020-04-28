package com;

import java.util.*;

public class TataMemorialHospital implements Hospital
{
	
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Room> roomList = new ArrayList<Room>();

	@Override
	public int addDoctor(Doctor doc) throws DoctorAlreadyExistException {
		// TODO Auto-generated method stub
		for (Doctor d : doctorList) {
			if (d.getDoctorName().equalsIgnoreCase(doc.getDoctorName())
					&& d.getSpecialization().equalsIgnoreCase(doc.getSpecialization())) {
				throw new DoctorAlreadyExistException();
			}
		}
		doctorList.add(doc);
		return doctorList.size();
	}
	
	
	@Override
	public int addRoom(Room room) throws RoomNotAvailableException {
		
		for(Room r : roomList)
		{
			if(r.getRoomNo()==room.getRoomNo())
			{
				throw new RoomNotAvailableException();
			}
		}
		roomList.add(room);
		return roomList.size();
	}
	
	@Override
	public int allocateRoom(String str) throws RoomNotAvailableException {
		
		for(Room r:roomList)
		{
			if(r.getRoomType().equalsIgnoreCase(str) && r.roomOccupied==false)
				
			{
				r.roomOccupied=true;
				return r.roomNo;
			}
		}
		throw new RoomNotAvailableException();
	}
	
	
	public Set<String> getDifferentSpecializations()
	{
		TreeSet<String> res = new TreeSet<String>();
		for(Doctor d:doctorList)
		{
			res.add(d.specialization);
		}
		return res;
	}
	
	public HashMap<String,ArrayList<Room>> getMapByAllocation()
	{
		ArrayList<Room> allotted = new ArrayList<Room>();
		ArrayList<Room> unallotted = new ArrayList<Room>();
		HashMap<String,ArrayList<Room>> res = new HashMap<String,ArrayList<Room>>();
		for(Room r:roomList)
		{
			if(r.roomOccupied==true)
			{
				allotted.add(r);
			}
			else
			{
				
				unallotted.add(r);
			}
		}
		res.put("allotted", allotted);
		res.put("unallotted", unallotted);
		
		return res;
	}
	
	
public static void main(String[] args) throws DoctorAlreadyExistException, RoomNotAvailableException {
		TataMemorialHospital tmh = new TataMemorialHospital();
		tmh.doctorList.add(new Doctor("Velantish",1000,"Cadio"));
		tmh.doctorList.add(new Doctor("Rudraksh",250,"Dermo"));
		tmh.doctorList.add(new Doctor("Swathi",2000,"Cadio"));

		Doctor doc = new Doctor("Swathii", 2000, "cadio");
//		tmh.addDoctor(doc);
		for (Doctor d: tmh.doctorList) {
			System.out.println("Name: " + d.getDoctorName() + " Specialization: " + d.getSpecialization());
		}
		tmh.roomList.add(new Room(125,"AC"));
		tmh.roomList.add(new Room(126,"NON-AC"));
		tmh.roomList.add(new Room(127,"AC"));
		tmh.roomList.add(new Room(128,"NON-AC"));
		Room r = new Room(120,"NON-AC");
		int num = tmh.addRoom(r);
		System.out.println(num);
		Set<String> setOfSpecializations = tmh.getDifferentSpecializations();
		System.out.println(setOfSpecializations);
		tmh.allocateRoom("AC");
		tmh.allocateRoom("AC");

		
		HashMap<String,ArrayList<Room>> hashmap = tmh.getMapByAllocation();
		
		ArrayList<Room> alloted = hashmap.get("allotted");
		System.out.println("allotted rooms");
		for(Room all:alloted)
		{
			System.out.println(all.roomNo+" "+all.roomType);
		}
		
		ArrayList<Room> unalloted = hashmap.get("unallotted");
		System.out.println("unallotted rooms");
		for(Room all:unalloted)
		{
			System.out.println(all.roomNo+" "+all.roomType);
		}

		
//		Iterator<String> itr = hashmap.keySet().iterator();
//		while(itr.hasNext())
//		{
//			String name = itr.next();
//			System.out.println(name);
//			for(Room r1 : hashmap.get(name))
//			{
//				System.out.println(r1.roomNo);
//			}
//		}
		
	}

}
