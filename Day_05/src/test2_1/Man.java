package test2_1;

public class Man extends Human {
    public Man() {
    }

    public Man(String name, int age, char sex) {
        super(name, age, sex);
    }

    @Override
    public void speak() {
        System.out.println("我还会唱歌");
    }

    public void isMan() {
        if (getSex() == '男') {
            System.out.println("我是男的");
        } else {
            System.out.println("我不是男的");
        }
    }
}
