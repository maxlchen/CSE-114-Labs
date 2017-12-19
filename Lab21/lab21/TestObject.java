package lab21;

import java.util.Scanner;
public class TestObject
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt();
		GeometricObject[] aObject = new GeometricObject[5];
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Square or Triangle?" + "(" + (i+1) + ")");
			String shape = sc.next();
			if(shape.equals("Square"))
			{
				System.out.println("Enter a side length");
				aObject[i] = new Square(sc.nextDouble());
			}
			else
				if(shape.equals("Triangle"))
				{
					System.out.println("Enter 2 sides");
					aObject[i] = new Triangle(sc.nextDouble(), sc.nextDouble());
				}
		}
		for(int i =0; i < aObject.length; i++)
		{
			if(aObject[i] instanceof Colorable){
			((Colorable) aObject[i]).howToColor();
			}
			System.out.println("area: " + aObject[i].getArea());
			System.out.println("perimeter: " + aObject[i].getPerimeter());
		}
	}
}
