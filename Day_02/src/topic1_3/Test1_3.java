package topic1_3;

public class Test1_3 {
    public static void main(String[] args) {
        //创建长方体对象
        Cuboid cuboid = new Cuboid();
        cuboid.setLength(10);
        cuboid.setWidth(5);
        cuboid.setHeigth(20);

        System.out.println("长方体底面积为: " + cuboid.getArea() + " 平方厘米");
        System.out.println("长方体体积为: " + cuboid.getVolume() + " 立方厘米");
    }
}
