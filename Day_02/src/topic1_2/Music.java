package topic1_2;

public class Music {
    public static void tune(Instrument instrument) {
        instrument.play();
    }


    public static void main(String[] args) {
        Wind wind = new Wind();
        Brass brass = new Brass();
        //多态,父类 接口作为形参,可以传入子类 实现类作为实参,运行方法
        tune(wind);
        tune(brass);
        wind.play2();
        brass.play2();
    }
}
