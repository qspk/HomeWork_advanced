package test1_1;

public class Test {
    public static void main(String[] args) {
        //InterA
        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("show.....A");
            }
        });
        useInterA(() -> System.out.println("show.....A"));

        //InterB
        useInterB(new InterB() {
            @Override
            public void method(int num) {
                System.out.println("num = " + num);
            }
        });

        useInterB(num -> System.out.println("num = " + num));

        //InterC
        useInterC(new InterC() {
            @Override
            public String function() {
                return "function.....B";
            }
        });

        useInterC(() -> "function.....B");

        //InterD
        useInterD(new InterD() {
            @Override
            public int niubility(int x, int y) {
                return (x + y);
            }
        });

        useInterD((x, y) -> (x + y));
    }

    public static void useInterA(InterA a) {
        a.show();
    }

    public static void useInterB(InterB b) {
        b.method(8);
    }

    public static void useInterC(InterC c) {
        System.out.println(c.function());
    }

    public static void useInterD(InterD d) {
        System.out.println("x + y = " + d.niubility(3, 5));
    }

}
