package topic1_3;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //计算面积
    public double getArea() {
        return length * width;
    }

    /**
     * 获取
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 获取
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }
}
