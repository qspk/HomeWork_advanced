package test2_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<movie> movies = new ArrayList<>();
        movies.add(new movie("你好,世界", 99.0, "aa"));
        movies.add(new movie("Java", 98.0, "bb"));
        movies.add(new movie("从入门到入狱", 100.0, "cc"));

        for (movie movie : movies) {
            System.out.println(movie);
        }
    }
}
