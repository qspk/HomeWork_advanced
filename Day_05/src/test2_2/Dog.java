package test2_2;

public class Dog extends Animal implements LookHome {
    @Override
    public void lookHome() {
        System.out.println("我会看家护院");
    }

    @Override
    public void eat() {
        System.out.println("我吃狗粮!");
    }

    public void speak() {
        System.out.println("我是"+getZhonglei());
    }

    public Dog() {
    }

    public Dog(String zhonglei, String name) {
        super(zhonglei, name);
    }
}
