/*
*LoyaltyRewards.java
*N Varadi
*01 12 2020
*/

public class LoyaltyRewards{


	//Declare data members

	private String cardStatus;
	private int numberOfFlights;
	private double ticketPrice;
	private double milesEarned;


	//Constructor, assign initial values to data members

	public LoyaltyRewards(){
		cardStatus = "";
		numberOfFlights = 0;
		ticketPrice = 0.00;
		milesEarned = 0.00;
	}

	//Create input methods/setters for each input

	public void setCardStatus(String cardStatus){
		this.cardStatus = cardStatus;
	}

	public void setNumberOfFlights(int numberOfFlights){
		this.numberOfFlights = numberOfFlights;
	}

	public void setTicketPrice(double ticketPrice){
		this.ticketPrice = ticketPrice;
	}

	//Create computation method

	public void compute(){
		if(cardStatus.equalsIgnoreCase("bronze")){
			if(numberOfFlights >= 1 && numberOfFlights <= 4){
				milesEarned = 3 * ticketPrice;
			}
			else if(numberOfFlights >= 5){
				milesEarned = 4 * ticketPrice;
			}
			else{
				System.out.println("That is not a valid input");
			}
		}
		else if(cardStatus.equalsIgnoreCase("silver")){
			if(numberOfFlights >= 1 && numberOfFlights <= 4){
				milesEarned = 5 * ticketPrice;
			}
			else if(numberOfFlights >= 5){
				milesEarned = 6 * ticketPrice;
			}
			else{
				System.out.println("That is not a valid input");
			}
		}
		else if(cardStatus.equalsIgnoreCase("gold")){
			if(numberOfFlights >= 1 && numberOfFlights <= 4){
				milesEarned = 7 * ticketPrice;
			}
			else if(numberOfFlights >= 5){
				milesEarned = 8 * ticketPrice;
			}
			else{
				System.out.println("That is not a valid input");
			}
		}
		else{
			System.out.println("That is not a valid input value.");
		}
	}

	//Create output/getter method
	public double getMilesEarned(){
		return milesEarned;
	}
}