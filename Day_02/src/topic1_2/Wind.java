package topic1_2;

public class Wind extends Instrument{

    @Override
    public void play() {
        System.out.println("弹奏wind");
    }

    public void play2() {
        System.out.println("调用wind的play2()方法");
    }
}
