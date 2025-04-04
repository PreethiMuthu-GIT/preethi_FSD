package com.hotelManagement;

public abstract class Room {
	
  int roomId;
  String roomNum;
  double roomFare;
  
  public Room(int roomId, String roomNum, double roomFare) {
	  this.roomId=roomId;
	  this.roomNum=roomNum;
	  this.roomFare=roomFare;
  }

public int getRoomId() {
	return roomId;
}

public void setRoomId(int roomId) {
	this.roomId = roomId;
}

public String getRoomNum() {
	return roomNum;
}

public void setRoomNum(String roomNum) {
	this.roomNum = roomNum;
}

public double getRoomFare() {
	return roomFare;
}

public void setRoomFare(double roomFare) {
	this.roomFare = roomFare;
}
  public abstract void roomInfo();
}
