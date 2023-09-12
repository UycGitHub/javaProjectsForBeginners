/*README SECTION:
 * The program evaluates the average cost of the shares after a number of transactions. 
 * A Stock class is created, 
 * and the methods there can update the average cost of the shares after each transaction.
 *  AVERAGE STOCK PRICE
 *	Create a stock class
 *	Record buying and selling of stock
 *	Update the share capital
 *	Update the average price of stock
 *
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=oTK8urCl-_c&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=3
 * 
 */
public class Driver {

	public static void main(String[] args) {
		Stock uyCompanyStock = new Stock();
		uyCompanyStock.buy(36.8, 2000);
		uyCompanyStock.buy(39.9, 3000);
		uyCompanyStock.sell(45.9, 1000);
		
		System.out.println(uyCompanyStock.getShares());
		System.out.println(uyCompanyStock.getPrice());
		System.out.println(uyCompanyStock.getAverageCost());
	}

}
