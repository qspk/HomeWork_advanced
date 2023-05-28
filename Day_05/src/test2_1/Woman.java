package test2_1;

public class Woman extends Human {
    public void isWoman() {
        if (getSex() == '女') {
            System.out.println("我是女的");
        } else {
            System.out.println("我不是女的");
        }
    }

    public Woman() {
    }

    public Woman(String name, int age, char sex) {
        super(name, age, sex);
    }
}
