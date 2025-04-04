package com.hotelManagement;

public class Standardroom extends Room{
  
	boolean ac_Availability;
	
	public Standardroom(int roomId, String roomNum, double roomFare, boolean ac_Availability) {
		super(roomId,roomNum,roomFare);
		this.ac_Availability=ac_Availability;
	}

	@Override
	public void roomInfo() {
		System.out.println("***Standard Room***");
		System.out.println("Room Id:"+super.roomId);
		System.out.println("Room Number:"+super.roomNum);
		System.out.println("Room Price:"+super.roomFare);
		System.out.println("Ac Availability:"+this.ac_Availability);
		
	}
}
