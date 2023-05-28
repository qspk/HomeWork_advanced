package test2_3;

public class Truck extends Car implements CarryGoods, ChangeColor {
    private double payLoad;

    public void setPayLoad(double payLoad) {
        this.payLoad = payLoad;
    }

    public double getPayLoad() {
        return payLoad;
    }

    public Truck(double payLoad) {
        this.payLoad = payLoad;
    }

    public Truck(int loader, double payLoad) {
        super(loader);
        this.payLoad = payLoad;
    }

    public Truck(int wheels, double weight, int loader, double payLoad) {
        super(wheels, weight, loader);
        this.payLoad = payLoad;
    }

    @Override
    public void changeColor() {
        System.out.println("把卡车改成棕色了");
    }

    @Override
    public void carryGoods() {
        System.out.println("卡车能拖10吨货物");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payLoad=" + payLoad +
                "} " + super.toString();
    }
}
