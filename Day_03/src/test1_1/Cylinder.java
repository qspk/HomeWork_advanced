package test1_1;

public class Cylinder implements C {
    private double radius;
    private double height;
    private String color;
    @Override
    public double Area() {
        double area = radius * PI * PI;
        return area;
    }

    @Override
    public void setColor(String color) {
        System.out.println("这个圆柱体是" + color + "的");
    }

    @Override
    public void Volume() {
        double area = Area();
        double volume = area * height;
        System.out.println("圆柱体的体积为: " + volume);
    }

    public Cylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }



    public Cylinder() {
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
