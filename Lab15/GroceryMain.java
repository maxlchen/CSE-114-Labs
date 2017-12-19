//Max Chen
///111316366
package lab15;

public class GroceryMain {
	public static void main(String[] args){
		GroceryList list = new GroceryList();
		GroceryItem milk = new GroceryItem("milk", 1.50, 3);
		GroceryItem eggs = new GroceryItem("eggs", 2.50, 3);
		GroceryItem chocolate = new GroceryItem("chocolate", 1.00, 9);
		GroceryItem bread = new GroceryItem("bread", 3.00, 2);
		list.add(milk);
		list.add(eggs);
		list.add(chocolate);
		list.add(bread);
		//System.out.print(list.list[0].getCost());
		System.out.print(list.getTotalCost());



		
	}

}
