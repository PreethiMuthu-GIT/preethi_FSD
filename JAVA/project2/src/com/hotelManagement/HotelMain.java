package com.hotelManagement;

public class HotelMain {

	
	public static void main(String[] args) {
		DeluxeRoom dr = new DeluxeRoom(350, "11001", 500, 5500);
		Standardroom sr = new Standardroom(351, "11002", 700, true);
		Customer cs = new Customer(400, "Preethi", "9090909090", sr);
		cs.rentRoom();
		cs.show();
	}
}
