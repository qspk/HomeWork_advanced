package test2_3;

public class Test {
    public static void main(String[] args) {
        Car c = new Car(4, 600, 4);
        System.out.println(c.toString());
        if (c.getLoader() >= 6) {
            System.out.println("超员了");
        } else {
            System.out.println("小汽车载了" + c.getLoader() + "人");
        }
        c.changeColor();
        System.out.println("------------------");

        Truck t = new Truck(6, 1000, 3, 800);
        System.out.println(t.toString());
        if (t.getLoader() >= 4) {
            System.out.println("超员了");
        } else {
            System.out.println("大卡车载了" + t.getLoader() + "人");
        }

        if (t.getPayLoad() > 1000) {
            System.out.println("大卡车超载了");
        } else {
            System.out.println("大卡车载了" + t.getPayLoad() + "吨货物");
        }
        t.changeColor();
        t.carryGoods();
    }
}
