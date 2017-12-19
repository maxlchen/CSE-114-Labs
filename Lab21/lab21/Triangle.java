package lab21;

class Triangle extends GeometricObject {
    Triangle(double sidex, double sidey) {
        objtype = "Triangle";
        x = sidex;
        y = sidey;
    }

    @Override
    //public void howToColor() {
        //System.out.println(objtype);
        //System.out.println("Use a rainbow crayon: xxx");
    //}
    
    public double getPerimeter() {
        return 1;
    }
    
    public double getArea() {
        return 1;
    }
}
