package ics372group3;

import java.util.ArrayList;
import java.util.List;

public class DealerList {
	// Need to create a list for dealerList
	private List<Dealer> dealerList = new ArrayList<Dealer>();
	
	// Add an addDealer method
	// Add a printFullInventory method
	
	public void addDealer(Dealer dealer) {
		if(dealerExist(dealer.getDealerId())) {
			System.out.println("~~~ Error: dealer already exists.");
			// already in dealers list. Do nothing.	
		} else {
			// dealer does not exist in the list. Add Now.
			dealerList.add(dealer);	
		}
	}

	public boolean dealerExist(int dealerID) {
		//taking a boolean varibale and say false
		boolean isExist = false;
		// loop through all the dealers that we have already.
		for (int i = 0; i < dealerList.size(); i++) {
			// check if any of the dealer have the same ID as given ID.
			// match, If the dealer ID already exist in the list make isExist true.
			if (dealerList.get(i).getDealerId() == dealerID) {
				isExist = true;	
			}
		}
		// return the result.
		return isExist;
	}

	public void setAcquisition(int inputId, boolean status){
		for (Dealer dealer : dealerList) {
			if (dealer.getDealerId() == inputId) {
				dealer.setAcquisitionEnabled(status);
			} else {
				System.out.println("~~~ Error: dealer " + inputId + " not found.");
			}
		}
	}
	
	public void printFullInventory() {
		System.out.print("Full Inventory");
		for (int i = 0; i < dealerList.size(); i++) {
			// Take each dealer and print its inventory.
			// That makes the full inventory
			dealerList.get(i).printInventory();
		}
		
	}
}