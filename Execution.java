//Max Chen
//111316366
package lab14;
//import java.util.*;
public class Execution {
	public static void main(String[] args){
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
		Stock stock = new Stock("GOOG", "Google Inc.");
		stock.setPreviousClosingPrice(100);
		stock.setCurrentPrice(90);
		System.out.println();
		System.out.println("Stock name: " + stock.getName() + ",  Stock Symbol: " + stock.getSymbol());
		System.out.print("Percentage change in stock prices: " );
		System.out.printf("%.2f", stock.changePercent());
		System.out.print("%");
	}

}
