//Max Chen
//111316366
package lab14;

public class Fan {
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
		
	}
	public int getSpeed(){
		return speed;
	}
	public boolean getOn(){
		return on;
	}
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public void setSpeed(int spd){
		speed = spd;
		
	}
	public void setOn(boolean onOff){
		on = onOff;
	}
	public void setRadius(double rad){
		radius = rad;
	}
	public void setColor(String col){
		color = col;
	}
	public String toString(){
		
		if(on){
			return "Fan speed: " + speed + " color: " + color + " radius: " + radius;
			
		}
		else{
			return "Fan color: " + color + " radius: " + radius + " fan is off";
		}
	}

	
}
