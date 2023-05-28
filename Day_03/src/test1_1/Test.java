package test1_1;

public class Test {
    public static void main(String[] args) {
        //创建圆柱体对象
        //初始化 半径 4  高度 5   颜色 透明
        Cylinder cylinder = new Cylinder(4, 5, "透明");

        System.out.println("圆柱体底面积为: " + cylinder.Area());
        cylinder.Volume();
        cylinder.setColor(cylinder.getColor());

    }

}
