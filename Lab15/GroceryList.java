//Max Chen
///111316366
package lab15;

public class GroceryList {
	public GroceryItem[] list;
	private int numItems;
	public GroceryList(){
		list = new GroceryItem[10];
		numItems = 0;
	}
	public void add(GroceryItem item){
		if(numItems <10){
			list[numItems] = item;
			numItems++;
		}
	}
	public double getTotalCost(){
		double sum = 0.0;
		GroceryItem temp;
		for(int i = 0; i < numItems; i++){
			temp = list[i];
			sum += temp.getCost();
		}
		return sum;
	}

}
