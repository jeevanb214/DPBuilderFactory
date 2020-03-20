package com.client;

import com.builder.Phone1;

public class Client {

	public static void main(String[] args) {

		Phone1 ph = new Phone1.Phone1Builder("4", "8", "good").build();
		System.out.println(ph);

		Phone1 ph1 = new Phone1.Phone1Builder("4", "8", "good").setBluetoothEnabled(true).setWiFiEnabled(false).build();
		System.out.println(ph1);
	}

}
