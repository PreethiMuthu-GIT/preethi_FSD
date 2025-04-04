package com.hotelManagement;

public class Customer extends Person {
 
	int roomId;
	Room room;//has a relation
	
	public Customer(int id, String name, String phnnum, Room room) {
		super(id,name,phnnum);
		this.room = room;
	}
	
	public void rentRoom() {
		this.roomId=room.getRoomId();
		
	}

	@Override
	public void show() {
		System.out.println("***Customer Details***");
		System.out.println("\t Customer Id: "+super.id);
		System.out.println("\t Customer Name: "+super.name);
		System.out.println("\t Customer phnNum: "+super.phnnum);
		System.out.println("\t Customer RoomId: "+this.roomId);
		
	}
}

