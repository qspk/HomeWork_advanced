package test2_3;

public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle() {
    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    /**
     * 获取
     * @return wheels
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * 设置
     * @param wheels
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * 获取
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Vehicle{wheels = " + wheels + ", weight = " + weight + "}";
    }
}
