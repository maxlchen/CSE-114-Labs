//Max Chen
///111316366
package lab15;

public class Complex {
	public double a, b;
	private String complexNum;
	public Complex(double aA, double bB){
		a = aA;
		b = bB;
		complexNum = a + " + " + b + "i";
		
	}
	public Complex(double aA){
		a = aA;
		b = 0;
		complexNum = a + " + " + b + "i";
	}
	public Complex(){
		a = 0;
		b = 0;
		complexNum = a + " + " + b + "i";
	}
	public static String add(Complex C1, Complex C2){
		double sumA = C1.a + C2.a;
		double sumB = C1.b + C2.b;
		return sumA + " + " + sumB + "i";
		
	}
	public static String subtract(Complex C1, Complex C2){
		double diffA = C1.a - C2.a;
		double diffB = C1.b - C2.b;
		return diffA + " + " + diffB + "i";

	}
	public static String multiply(Complex C1, Complex C2){
		double prodA = (C1.a * C2.a - C1.b * C2.b);
		double prodB = (C1.b * C2.a + C1.a * C2.b);
		return prodA + " + " + prodB + "i";

	}
	public static String divide(Complex c1, Complex c2){
		double divA = (c1.a*c2.a + c1.b * c2.b)/(c2.a * c2.a + c2.b * c2.b);
		double divB = (c1.b * c2.a - c1.a * c2.b)/(c2.a * c2.a + c2.b * c2.b);
		return divA + " + " + divB + "i";

	}
	public static String toString(Complex c){
		return c.a + " + " + c.b + "i";
	}
	public static String getRealPart(Complex c){
		return Double.toString(c.a);
	}
	public static String getImaginaryPart(Complex c){
		return Double.toString(c.b);
	}

}
