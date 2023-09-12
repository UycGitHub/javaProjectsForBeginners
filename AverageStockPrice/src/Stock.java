
public class Stock {
	//FIELDS:
	private int shares;
	private double price;
	private double capital;
	
	//I did not make a constructor, I used default.
	//Because these are beginner level projects.
	
	//METHODS:
	/*We have beginner level projects
	 *So, 
	 *I did not use "this". instead of different
	 *names for parameters
	 */
	public void buy(double priceParameter, int sharesParameter) {
		shares += sharesParameter;
		price = priceParameter;
		capital += priceParameter*sharesParameter;
	}
	
	public void sell(double priceParameter, int sharesParameter) {
		shares -= sharesParameter;
		price = priceParameter;
		capital -= priceParameter*sharesParameter;
	}
	
	public int getShares() {
		return shares;
	}
	
	public double getPrice() {
		return price;
	}
	
	/* getAverageCost method description
	 * average capital I invested per stock
	 * which is not related to the real-time stock price. 
	 */
	public double getAverageCost() { //average capital I invested per stock
		return capital / getShares();
	}
}
