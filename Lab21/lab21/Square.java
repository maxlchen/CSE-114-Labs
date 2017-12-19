package lab21;

class Square extends GeometricObject implements Colorable
{
    Square(double x) {
        objtype = "Square";
        x = x;
        y = x;
    }

    @Override
    public void howToColor() {
        System.out.println(objtype);
        System.out.println("Use a rainbow crayon");
    }
    public double getPerimeter() {
        return y * 4;
    }
    
    public double getArea() {
        return y * y;
    }
}