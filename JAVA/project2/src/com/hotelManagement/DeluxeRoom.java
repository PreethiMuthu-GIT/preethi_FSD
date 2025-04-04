package com.hotelManagement;

public class DeluxeRoom extends Room{
  
	double roomSize;
	public DeluxeRoom(int roomId, String roomNum, double roomFare,double roomSize) {
		super(roomId,roomNum,roomFare);
		this.roomSize=roomSize;
		
	}
	@Override
	public void roomInfo() {
		System.out.println("***Deluxe Room***");
		System.out.println("Room Id:"+super.roomId);
		System.out.println("Room Number:"+super.roomNum);
		System.out.println("Room Price:"+super.roomFare);
		System.out.println("Room Size:"+this.roomSize);
		
	}
}
