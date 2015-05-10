package com.design.pattern.proxy;

class ProxyExample {
	public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");     

		image1.displayImage(); // loading necessary
		image1.displayImage(); // loading unnecessary
		image2.displayImage(); // loading necessary
		image2.displayImage(); // loading unnecessary
    }
}