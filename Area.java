public class Area 
{
    public static void main(String args[])
    {
        Area circle = new Area(2);
        circle.printArea();
        circle.setRadius(3.5);
        circle.printArea();
    }
    
    private double radius;
    public Area(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.pow(radius,2) * Math.PI;
    }
    
    public double getRadius() {return this.radius;}
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void printArea()
    {
        System.out.println("A Circle with the radius of " + radius + " has an area of " + getArea());
    }

}
