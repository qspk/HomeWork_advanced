package test3_1;

public class Test {
    public static void main(String[] args) {
        useAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        });

        useAnimal(() -> {
            System.out.println("猫吃鼠");
        });

        useAnimal(()-> System.out.println("猫吃鼠"));
    }

    public static void useAnimal(Animal animal) {
        animal.eat();
    }
}
