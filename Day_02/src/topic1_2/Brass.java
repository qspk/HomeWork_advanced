package topic1_2;

public class Brass extends Instrument {

    @Override
    public void play() {
        System.out.println("弹奏brass");
    }

    public void play2() {
        System.out.println("调用brass的play2()方法");
    }
}
