package bank;

public class CafeBranch extends Bank {

	private String menu;

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String toString() {
		return "Menu: " + menu;
	}
}
