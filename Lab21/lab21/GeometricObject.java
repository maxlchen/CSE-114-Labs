package lab21;

public abstract class GeometricObject {
	 double x, y;
	    String objtype;

	    public String toString() {
	        String result = "";
	        result += objtype;
	        result+='\n';
	        result+="howToColor: Rainbows"+'\n';
	        return result;
	    }


	    

	    public double getPerimeter() {
	        return (x + y) * 2;
	    }
	    
	    public double getArea() {
	        return x * y;
	    }
	}



interface Colorable {
    void howToColor();
}
