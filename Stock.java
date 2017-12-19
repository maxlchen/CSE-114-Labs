//Max Chen
//111316366
package lab14;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	public Stock(String sym, String nam){
		symbol = sym;
		name = nam;
	}
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}

	public double getCurrentPrice(){
		return currentPrice;
	}
	public String getSymbol(){
		return symbol;
	}
	public String getName(){
		return name;
	}
	/*public void setName(String inName){
		name = inName;
	}*/
	/*public void setSymbol(String inSymbole){
		name = inSymbole;
		
	}*/
	public void setCurrentPrice(double p){
		currentPrice = p;
	}
	public void setPreviousClosingPrice(double lastp){
		previousClosingPrice = lastp;
	}
	public double changePercent(){
		//System.out.println(getCurrentPrice());
		//System.out.println(getPreviousClosingPrice());
		//System.out.print(1.0 - getCurrentPrice()/getPreviousClosingPrice());
		return ((1-( getCurrentPrice() / getPreviousClosingPrice())) * 100);
	}
	

}
