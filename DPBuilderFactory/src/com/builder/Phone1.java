package com.builder;

public class Phone1 {

	private String ram;
	private String storage;
	private String processor;
	private boolean isBluetoothEnabled;
	private boolean isWiFiEnabled;

	public String ram() {
		return this.ram;
	}

	public String storage() {
		return this.storage;
	}

	public String processor() {
		return this.processor;
	}

	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}

	public boolean isWiFiEnabled() {
		return this.isWiFiEnabled;
	}

	public Phone1(Phone1Builder builder) {
		this.ram = builder.ram;
		this.storage = builder.storage;
		this.processor = builder.processor;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isWiFiEnabled = builder.isWiFiEnabled;
	}

	public static class Phone1Builder {
		private String ram;
		private String storage;
		private String processor;

		// optional
		private boolean isBluetoothEnabled;
		private boolean isWiFiEnabled;

		public Phone1Builder(String ram, String storage, String processor) {
			super();
			this.ram = ram;
			this.storage = storage;
			this.processor = processor;
		}

		public Phone1Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Phone1Builder setWiFiEnabled(boolean isWiFiEnabled) {
			this.isWiFiEnabled = isWiFiEnabled;
			return this;
		}

		public Phone1 build() {
			return new Phone1(this);
		}
	}

	@Override
	public String toString() {
		return "Phone1 [ram=" + ram + ", storage=" + storage + ", processor=" + processor + ", isBluetoothEnabled="
				+ isBluetoothEnabled + ", isWiFiEnabled=" + isWiFiEnabled + "]";
	}

}
