package com.design.pattern.proxy;

class ProxyExample {
	public static void main(String[] args) {
		RealImage realImage = new RealImage("HiRes_10MB_Photo1");
		realImage.displayImage();

		// change to proxy image
    }
}