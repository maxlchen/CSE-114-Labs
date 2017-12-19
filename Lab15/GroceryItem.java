//Max Chen
///111316366
package lab15;

public class GroceryItem {
	private String name;
	private double price;
	private int quantity;
	public GroceryItem(String n, double p, int q){
		name = n;
		price = p;
		quantity = q;
	}
	public double getCost(){
		return price * quantity;
	}
	public void setQuantity(int q){
		quantity = q;
	}
	
}
