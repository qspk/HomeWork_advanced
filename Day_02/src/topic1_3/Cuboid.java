package topic1_3;

public class Cuboid extends Rectangle {
    private double heigth;

    //计算体积
    public double getVolume() {
        return heigth * getArea();
    }

    public Cuboid() {
    }

    public Cuboid(double heigth) {
        this.heigth = heigth;
    }

    /**
     * 获取
     * @return heigth
     */
    public double getHeigth() {
        return heigth;
    }

    /**
     * 设置
     * @param heigth
     */
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
}
