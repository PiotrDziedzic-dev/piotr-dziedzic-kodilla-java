package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

import java.lang.reflect.Array;
import java.util.*;

@DisplayName("TDD : Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 1;

    @BeforeAll//czemu te dwie metody sa statyczne ?
    public static void beforAllTests(){
        System.out.println("This is the beginning of the tests");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("This is the end of the tests");
    }
    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Test number "+testCounter+" is starting");
    }
    @AfterEach
    public void afterEveryTest() {
        System.out.println("Test number "+testCounter+" had finished");
        testCounter++;
    }

    @Nested
    @DisplayName("Actions with figures")
    public class TestActions {
        @Test
        public void testAddFigure() {
            //Given
            Shape Figure1 = new Circle("Circle",2);
            ShapeCollector collector1 = new ShapeCollector();

            //When
            collector1.addFigure(Figure1);

            //Then
            Assertions.assertEquals(1,collector1.setOfFigures.size());
        }
        @Test
        public void testRemoveFigure() {
            //Given
            Shape Figure1 = new Circle("Circle",4);
            Shape Figure2 = new Triangle("Triangle",4,5);
            ShapeCollector collector1 = new ShapeCollector();

            //When
            collector1.addFigure(Figure1);
            collector1.addFigure(Figure2);
            collector1.removeFigure(Figure2);

            //Then
            Assertions.assertEquals(1,collector1.setOfFigures.size());
        }
    }

    @Nested
    @DisplayName("Getting informations about figures")
    public class TestInformations {
        @Test
        public void getFigure() {
            //Given
            Shape Figure1 = new Triangle("Triangle",4,5);
            ShapeCollector collector1 = new ShapeCollector();
            collector1.setOfFigures.add(Figure1);

            //When
            Shape x = collector1.getFigure(0);
            //Then
            Assertions.assertEquals(x,Figure1);//czy tutaj moga byc obiekty ?

        }
        @Test
        public void showFigures() {
            //Given

            Shape Figure1 = new Circle("Circle",4);
            Shape Figure2 = new Triangle("Triangle",4,5);
            Shape Figure3 = new Square("Square",5);
            ShapeCollector collector1 = new ShapeCollector();
            collector1.setOfFigures.add(Figure1);
            collector1.setOfFigures.add(Figure2);
            collector1.setOfFigures.add(Figure3);

            //When
            String x = collector1.showFigures();
            //Then
            Assertions.assertEquals(x,Figure1.getShapeName()+Figure2.getShapeName()+Figure3.getShapeName());

        }

    }
}
