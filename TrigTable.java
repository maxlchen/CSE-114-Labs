
public class TrigTable {
	public static void main(String[] args){
		int degree = 0;
		System.out.println("Degree\tSin\tCos");
		while(degree<=360){
			System.out.println(degree + "\t" + Math.round(Math.sin(degree*3.14159265359/180)*10000.0)/10000.0 + "\t" + Math.round(Math.cos(degree*3.14159265359/180)*10000.0)/10000.0);
			degree = degree + 10;
		}
	}

}
