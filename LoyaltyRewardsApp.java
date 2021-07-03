/*
*LoyaltyRewardsApp.java
*N Varadi
*01 12 2020
*/

import javax.swing.JOptionPane; //Import JOptionPane to accept user input

public class LoyaltyRewardsApp{
	public static void main(String args[]){

		//Variables

		String cardStatus;
		int numberOfFlights;
		double ticketPrice;
		double milesEarned;

		//Create an object instance of the instantiable class, so we can access methods associated with that class

		LoyaltyRewards myLoyaltyRewards = new LoyaltyRewards();

		//Ask user for input, call setter methods and send out user input to instan class for processing

		cardStatus = JOptionPane.showInputDialog(null, "Please enter your card status: bronze/silver/gold");
		myLoyaltyRewards.setCardStatus(cardStatus);

		numberOfFlights = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of flights you had this year"));
		myLoyaltyRewards.setNumberOfFlights(numberOfFlights);

		ticketPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price of your ticket"));
		myLoyaltyRewards.setTicketPrice(ticketPrice);

		//Call compute method to carry out computations
		myLoyaltyRewards.compute();

		//Call getter method to return output value
		milesEarned = myLoyaltyRewards.getMilesEarned();


		//Print output to the user
		JOptionPane.showMessageDialog(null, "The number of miles you earned is: " + milesEarned);


	}
}