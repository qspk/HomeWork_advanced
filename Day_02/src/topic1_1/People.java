package topic1_1;

public class People {
    protected double height;
    protected double weight;

    public People() {

    }

    public People(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void speakHello() {
        System.out.println("你好");
    }

    public void averageHeight() {
        System.out.println("平均身高为: " + height);
    }

    public void averageWeight() {
        System.out.println("平均体重为: " + weight);
    }
}
