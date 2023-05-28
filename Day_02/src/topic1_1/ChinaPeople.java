package topic1_1;

public class ChinaPeople extends People {

    public ChinaPeople() {
    }

    public ChinaPeople(double height, double weight) {
        super(height, weight);
    }

    public void chinaGongfu() {
        System.out.println("我要打十个!");
    }

    @Override
    public void speakHello() {
        System.out.println("你好啊~");
    }

    @Override
    public void averageHeight() {
        System.out.println("中国人平均身高为: " + height + "厘米");
    }

    @Override
    public void averageWeight() {
        System.out.println("中国人平均体重为 " + weight + "千克");
    }
}
