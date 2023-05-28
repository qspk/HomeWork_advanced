package test2_1;

public class Human {
    private String name;
    private int age;
    private char sex;

    public void speak() {
        System.out.println("我会说话");
    }

    public void run() {
        System.out.println("我会跑路");
    }

    public String getInfo() {
        return "我叫" + name + ", 一位" + age + "岁的" + sex + "士";
    }

    public Human() {
    }

    public Human(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Human{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
