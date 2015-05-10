package com.design.pattern.proxy;

class ProxyExample {
	public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");

		image1.displayImage(); // loading necessary
		image1.displayImage(); // loading unnecessary
    }
}