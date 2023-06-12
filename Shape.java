public class Shape {

    private double x;
    private double y;
    private String color;

    Shape(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    String getDescription(double x, double y, String color){
        return "x-" + x + " y-" + y + " color - " + color;
    }

    public double getDistance(Shape shape){
        double distanceX = shape.x - this.x;
        double distanceY = shape.y - this.y;

        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }
}
