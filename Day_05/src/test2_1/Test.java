package test2_1;

public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        Human human = new Human();


        Human h1 = new Man("张三",34,'男');
        Human h2 = new Woman("赵六",33,'女');
        show(h1);
        show(h2);
    }
    public static void show(Human human) {
        String info =  human.getInfo();
        System.out.println(info);
        human.speak();
        human.run();
        if (human instanceof Man) {   //判断是男生类后,转型
            Man man = (Man) human;
            man.isMan();
        }
        if (human instanceof Woman) {   //判断是女生类后,转型
            Woman woman = (Woman) human;
            woman.isWoman();
        }
        human.getInfo();
    }
}
