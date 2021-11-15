package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for add figures")
    class TestAddFigures {
        @Test
        void testAddFigure() {
            //Given
            Shape shape = new Circle("circle_1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> shapeCollection = shapeCollector.getShapeCollection();

            //When
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollection.size());
        }
    }

    @Nested
    @DisplayName("Tests for remove figures")
    class TestRemoveFigures {
        @Test
        void testRemoveFigure() {
            //Given
            Shape shape = new Circle("circle_1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> shapeCollection = shapeCollector.getShapeCollection();
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollection.size());
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            Shape shape = new Circle("circle_1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests for get figures")
    class TestGetFigures {
        @Test
        void testGetFigure() {
            //Given
            Shape shape = new Circle("circle1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Tests for show figures")
    class TestShowFigures {
        @Test
        void testShowFigures() {
            //Given
            Shape circle = new Circle("circle_1", 32.76);
            Shape triangle = new Triangle("triangle_1", 12.34, 8.56);
            Shape square = new Square("square_1", 12.43);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);

            //When
            String retrievedFigures = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(circle.getShapeName() + triangle.getShapeName() + square.getShapeName(), retrievedFigures);
        }
    }
}
