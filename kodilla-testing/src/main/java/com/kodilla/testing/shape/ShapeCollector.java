package com.kodilla.testing.shape;
import java.util.*;


public class ShapeCollector {
    List<Shape> setOfFigures = new ArrayList<>();
    void addFigure(Shape shape) {
        setOfFigures.add(shape);

    }
    void removeFigure(Shape shape) {
        setOfFigures.remove(shape);

    }
     Shape getFigure(int n) {
        return setOfFigures.get(n);

    }
    void showFigures() {

    }
}
