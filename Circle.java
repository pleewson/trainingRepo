public class Circle extends Shape{

    private double radius;

    Circle(double x, double y, String color, double radius){
        super(x,y,color);
        this.radius = radius;
    }

    @Override
    protected String getDescription(){
        return "x-" + x + " y-" + y + " color - " + color + " radius-" + radius;
    }

    double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    double getCircuit(){
        return Math.PI * 2 * this.radius;
    }
}
