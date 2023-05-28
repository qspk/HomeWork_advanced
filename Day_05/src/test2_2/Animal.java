package test2_2;

public class Animal {
    private String zhonglei;
    private String name;

    public void eat() {
        System.out.println("我要饿了");
    }

    public void sleep() {
        System.out.println("我要睡觉了");
    }
    public void getInfo(){
        System.out.println("我的名字是："+getName()+" 我的种类是："+getZhonglei());
    }


    public Animal() {
    }

    public Animal(String zhonglei, String name) {
        this.zhonglei = zhonglei;
        this.name = name;
    }


    /**
     * 获取
     * @return zhongle
     */
    public String getZhonglei() {
        return zhonglei;
    }

    /**
     * 设置
     * @param zhonglei
     */
    public void setZhonglei(String zhonglei) {
        this.zhonglei = zhonglei;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal{zhongle = " + zhonglei + ", name = " + name + "}";
    }
}
