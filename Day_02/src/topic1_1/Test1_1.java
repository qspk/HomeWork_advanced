package topic1_1;

public class Test1_1 {
    public static void main(String[] args) {
        System.out.println("----中国------");
        ChinaPeople cp = new ChinaPeople(180, 70);
        cp.chinaGongfu();
        cp.speakHello();
        cp.averageHeight();
        cp.averageWeight();
        System.out.println("----美国------");
        AmericanPeople ap = new AmericanPeople(175, 80);
        ap.americanBoxing();
        ap.speakHello();
        ap.averageHeight();
        ap.averageWeight();
    }
}
