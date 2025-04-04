package com.polymorphism;

class oldTv{
	public void screen() {
		System.out.println("its lcd screen");
	}
	public void remote() {
		System.out.println("we have less options");
	}
	public void sound() {
		System.out.println("sound system is good quality");
	}
}
public class NewTv extends oldTv {
	public void screen() {
		System.out.println("its led screen");
	}
	public void remote() {
		System.out.println("we have more options");
	}
	public static void main(String[] args) {
		//oldTv od =new oldTv();
		//od.screen();
		//od.remote();
		NewTv nt = new NewTv();
		nt.screen();
		nt.remote();
		nt.sound();
	}

}
