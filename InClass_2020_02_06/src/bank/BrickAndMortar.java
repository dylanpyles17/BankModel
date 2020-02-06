package bank;

public class BrickAndMortar extends Bank {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Address: " + address;
	}
}
