package test2_2;

public class Fish extends Animal {
    public Fish() {
    }

    public Fish(String zhonglei, String name) {
        super(zhonglei, name);
    }

    public void speak() {
        System.out.println("我是"+getZhonglei());
    }

    public void eat() {
        System.out.println("我吃鱼食!");
    }

    public String toString() {
        return "Fish{}";
    }
}
