package test2_3;

public class Car extends Vehicle implements ChangeColor {
    private int loader;

    public Car() {
    }

    public Car(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    @Override
    public void changeColor() {
        System.out.println("把汽车改装成红色了");
    }

    /**
     * 获取
     * @return loader
     */
    public int getLoader() {
        return loader;
    }

    /**
     * 设置
     * @param loader
     */
    public void setLoader(int loader) {
        this.loader = loader;
    }




    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                "} " + super.toString();
    }
}
