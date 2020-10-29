package com.kodilla.good.patterns;
import com.kodilla.good.patterns.challenges.*;

public class GoodPatternsMain {
    private static String a="";

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .forEach(s->s.getValue().stream().forEach(x-> a = a + x+"!"));
        System.out.println(a);

    }
}
