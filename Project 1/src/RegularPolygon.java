import java.text.DecimalFormat;

public class RegularPolygon {
    private int numSides;
    private double side;
    double x, y;

    DecimalFormat format = new DecimalFormat("###.###");

    public RegularPolygon() {
        this.numSides = 3;
        this.side = 1;
        this.x = 0; this.y = 0;
    }

    public RegularPolygon(int numSides, double side, double x, double y) {
        this.numSides = numSides;
        this.side = side;
        this.x = x; this.y = y;
    }

    public int getNumSides() {
        return numSides;
    }

    public String getSide() {
        return format.format(side);
    }

    public String getX() {
        return format.format(x);
    }

    public String getY() {
        return format.format(y);
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String perimeter() {
        double perimeter = this.numSides * this.side;

        return format.format(perimeter);
    }

    public String area() {
        double area = ((this.numSides * (this.side * this.side))
                / (4 * Math.tan(Math.PI / this.numSides)));


        return format.format(area);
    }
}
