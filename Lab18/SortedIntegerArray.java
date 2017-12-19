//Max Chen
//111316366
package lab18;



public class SortedIntegerArray {
	private int[] arr;
	private int tracker;
	public SortedIntegerArray(int size){
		arr = new int[size];
		tracker = 0;
	}
	public int size(){
		return tracker;
	}
	public int get(int pos){
		if(pos>=0 && pos < arr.length){
			return arr[pos];
		}
		else{
			return -1;
		}
		
	}
	public String toString(){
		String text = "";
		//bubbleSort(arr);
		//for(int i = 0; i < tracker; i ++){
			//text += Integer.toString(arr[i]);
		//}
		for(int i = arr.length - tracker; i < arr.length; i++){
			text += arr[i];
		}
		return text;
	}
	public void add(int input){
		//int temp = 0;
		//int pos = 0;
		//boolean greaterThan = true;
		//System.out.println(input);
		if(tracker == arr.length){
			System.out.println("ERROR: ARRAY IS FULL");
		}
		else{
			arr[0] = input;
			tracker++;
			bubbleSort(arr);
			
		}
		
		
		
	}
	public void remove(int pos){
		arr[pos] = 0;
		//for(int i = pos; i < tracker; i++){
			//arr[i] = arr[i+1];
			
		//}
		bubbleSort(arr);
		tracker--;
		
	}
	public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
	public static void main(String[] args){
		SortedIntegerArray sort = new SortedIntegerArray(6);
		System.out.println("Creating a 6 integer SortedIntegerArray and adding the integers: 3, 2, 9, 1, 5, 4");
		sort.add(3);
		sort.add(2);
		sort.add(9);
		sort.add(1);
		sort.add(5);
		sort.add(4);
		System.out.println("SortedIntegerArray values:");
		System.out.println(sort);
		System.out.println("Number of elements:");
		System.out.println(sort.size());
		System.out.println("Value at index 3:");
		System.out.println(sort.get(3));
		System.out.println("Removing value at index 2:");
		sort.remove(2);
		System.out.println("New SortedIntegerArray:");
		System.out.print(sort);
		
	}

}
