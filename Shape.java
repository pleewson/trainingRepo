public class Shape {

    protected double x;
    protected double y;
    protected String color;

    Shape(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

   protected String getDescription(){
        return "x-" + x + " y-" + y + " color - " + color;
    }

    double getDistance(Shape shape){
        double distanceX = shape.x - this.x;
        double distanceY = shape.y - this.y;

        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

}
