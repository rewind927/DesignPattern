package com.design.pattern.proxy;

class ProxyImage implements Image {
	private String filename;

    public ProxyImage(String filename) { 
        this.filename = filename; 
    }
    public void displayImage() {
		//new RealImage and display image
    }
}