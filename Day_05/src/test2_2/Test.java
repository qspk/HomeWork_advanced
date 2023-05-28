package test2_2;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Fish("锦鲤", "小红");
        a1.getInfo();
        a1.eat();
        a1.sleep();
        if (a1 instanceof Fish) {
            Fish f = (Fish) a1;
            f.setZhonglei("鱼");
            f.eat();
            f.getInfo();
        } else {
            System.out.println("类型不符!");
        }
        Dog d = new Dog("柯基", "旺财");
        d.getInfo();
        d.lookHome();
        Animal a2 = (Animal) d;
        a2.eat();
        a2.sleep();
//        a2.lookHome; //报错,父类Animal没有 lookHome()方法
    }
}
