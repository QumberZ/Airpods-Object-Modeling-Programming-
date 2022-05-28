package edu.cuny.csi.csc330.lab4;

import java.util.Arrays;

import edu.cuny.csi.csc330.util.Randomizer;

public class Airpods {

	int serialNumber;
	int defaultVolume = 8;
	protected static final int MIN_VOLUME = 0;
	protected static final int MAX_VOLUME = 15;

	String connectivityState[] = { "White", "Orange", "Green", "No Color" };
	String airpodUsed[] = { "left", "right", "both", "none" };
	int chargingPercentage;
	boolean voiceCommand;

	int musicPlaylist;
	boolean pause;
	boolean play;
	boolean skip;
	boolean bluetoothConnected;

	public Airpods() {
		init();
	}

	private void init() {
		int randSerial = Randomizer.generateInt(111111111, 999999999);
		this.serialNumber = randSerial;
	}

	public void getSerialNumber() {
		System.out.printf("Serial Number: " + serialNumber);
	}

	public void bluetoothOn() {
		this.bluetoothConnected = true;
		System.out.println(", Airpods paired: " + bluetoothConnected);

	}

	public void bluetoothOff() {
		this.bluetoothConnected = false;
		System.out.printf(", Airpods paired: " + bluetoothConnected);

	}

	public int getVolume() {
		return defaultVolume;
	}

	public void increaseVolume(int volUp) {
		this.defaultVolume += volUp;
		System.out.printf(" Volume increased to: " + defaultVolume);
	}

	public void decreaseVolume(int volDown) {
		this.defaultVolume -= volDown;
		System.out.printf(", Volume decreased to: " + defaultVolume);
	}

	public void activateSiri() {
		this.voiceCommand = true;
		System.out.printf(", Siri: " + voiceCommand);
	}

	public void pairStatus() {
		if (connectivityState[0] == "White") {
			System.out.printf(", Airpods waiting to be paired");

		}

		else if (connectivityState[1] == "Orange") {
			System.out.printf(", Airpods charging in bluetooth case");

		}

		else if (connectivityState[2] == "Green") {
			System.out.printf(", Airpods fully charged");

		} else {
			System.out.printf(", Airpods battery: 0%");

		}

	}

	public void getAirpodUsed() {
		if (airpodUsed[0] == "left") {
			System.out.printf(" Left airpod in use");

		} else if (airpodUsed[1] == "right") {
			System.out.printf(", Right airpod in use");

		}

		else if (airpodUsed[2] == "both") {
			System.out.printf(", Both airpods in use");
		} else {
			System.out.printf(", No airpods in use");
		}

	}

	public void chargeLevel() {
		int charge = Randomizer.generateInt(0, 100);
		this.chargingPercentage = charge;
		System.out.println(" Airpods battery pecentage: " + charge + "%");
	}

	public void doubleTap() {
		this.pause = true;
		System.out.printf(", Audio paused: " + pause);

	}

	public void doubleTap2() {
		this.play = true;
		System.out.printf(", Audio continue to play: " + play);

	}

	public void tripleTap(int musicPlaylist) {
		this.skip = true;
		System.out.printf(", Audio skipped: " + skip);

		int next = Randomizer.generateInt(1, musicPlaylist);
		this.musicPlaylist = next;
		System.out.println("Song#: " + next + " playing ]");

	}

	public String toString() {

		String function = "Serial Number: " + serialNumber + ", Bluetooth On: " + bluetoothConnected
				+ ", selected Volume: " + defaultVolume + ", Connectivity State: " + connectivityState[3]
				+ ",\n  Siri on: " + voiceCommand + ", Airpods used: " + airpodUsed[3] + ", Charge level: "
				+ chargingPercentage + ", Audio paused: " + pause + ", Audio play: " + play + ", \n Audio skipped: "
				+ skip + "";

		return "Airpods Instance: [" + function + "] \n\n";
	}

	public String turnedOff() {

		String function = "Serial Number: " + serialNumber + ", Bluetooth On: " + bluetoothConnected
				+ ", selected Volume: " + defaultVolume + ", Connectivity State: " + connectivityState[3]
				+ ",\n  Siri on: " + voiceCommand + ", Airpods used: " + airpodUsed[3] + ", Charge level: "
				+ chargingPercentage + "";

		return "Airpods Instance: [" + function + "] \n\n";
	}

	public static void main(String[] args) {
		Airpods airpods = new Airpods();
		System.out.println("New Instance");
		System.out.println(airpods.toString());

		System.out.println("Turned on");
		System.out.println("Airpods Instance:[");
		airpods.getSerialNumber();
		airpods.bluetoothOn();
		airpods.getVolume();
		airpods.increaseVolume(5);
		airpods.decreaseVolume(2);
		airpods.activateSiri();
		airpods.pairStatus();
		airpods.chargeLevel();
		airpods.getAirpodUsed();
		airpods.doubleTap();
		airpods.doubleTap2();
		airpods.tripleTap(20);

		System.out.println("\n\nTurned off");
		System.out.println(airpods.turnedOff());

	}

}
