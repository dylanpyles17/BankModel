package main;

import bank.Bank;
import bank.BrickAndMortar;
import bank.CafeBranch;
import bank.Online;

public class Main {

	public static void main(String[] args) {
		Bank myBank = new Bank();
		
		myBank.setCompanyName("Fifth Third Bank");
		
		BrickAndMortar physicalBank = new BrickAndMortar();
		
		physicalBank.setCompanyName("Wells Fargo");
		physicalBank.setAddress("1234 Bank Ave.");
		
		Online onlineBank = new Online();
		
		onlineBank.setCompanyName("PNC");
		onlineBank.setUrl("https://www.pnc.com/en/personal-banking.html");
		
		CafeBranch starbucks = new CafeBranch();
		
		starbucks.setCompanyName("Starbucks");
		starbucks.setMenu("Mocha - hot/cold");
		
		System.out.println(myBank.toString() + "/n");
		System.out.println(physicalBank.toString() + "/n");
		System.out.println(onlineBank.toString() + "/n");
		System.out.println(starbucks.toString());
	}

}
