package test1_1;

//Instrument 类
class Instrument {
    public void play() {
        System.out.println("弹奏乐器");
    }
}

//Wind类
class Wind extends Instrument {
    @Override
    public void play() {
        System.out.println("弹奏Wind");
    }
    public void play2() {
        System.out.println("调用Wind的play2");
    }
}

//Brass 类
class Brass extends Instrument {
    @Override
    public void play() {
        System.out.println("弹奏Brass");
    }
    public void play2() {
        System.out.println("调用Brass的play2");
    }
}

//Test(Music) 类
public class Test {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Brass brass = new Brass();
        tune(wind);   //以Wind为对象
        tune(brass);  //以Brass为对象

        wind.play2();
        brass.play2();
    }

    public static void tune(Instrument instrument) {
        instrument.play();
    }
}
