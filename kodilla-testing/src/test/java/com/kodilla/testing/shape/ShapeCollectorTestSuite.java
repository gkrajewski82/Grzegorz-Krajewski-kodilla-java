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
    @DisplayName("Tests for circles")
    class TestCircle {
        @Test
        void testAddFigure() {
            //Given
            Shape circle1 = new Circle("circle_1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> shapeCollection = shapeCollector.getShapeCollection();

            //When
            shapeCollector.addFigure(circle1);

            //Then
            Assertions.assertEquals(1, shapeCollection.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            Shape circle1 = new Circle("circle_1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> shapeCollection = shapeCollector.getShapeCollection();
            shapeCollector.addFigure(circle1);

            //When
            boolean result = shapeCollector.removeFigure(circle1);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollection.size());
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            Shape circle1 = new Circle("circle_1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(circle1);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testGetFigure() {
            //Given
            Shape circle1 = new Circle("circle1", 32.76);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle1);

            //When
            Shape retrievedCircle = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle1, retrievedCircle);
        }
    }

    @Nested
    @DisplayName("Tests for triangles")
    class TestTriangle {

    }

    @Nested
    @DisplayName("Tests for squares")
    class TestSquare {

    }

    @Nested
    @DisplayName("Tests for all figures")
    class TestAllFigures {
        @Test
        void testShowFigures() {
            //Given
            Shape circle1 = new Circle("circle_1", 32.76);
            Shape triangle1 = new Triangle("triangle_1", 12.34, 8.56);
            Shape square1 = new Square("square_1", 12.43);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(square1);

            //When
            String retrievedFigures = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(circle1.getShapeName() + triangle1.getShapeName() + square1.getShapeName(), retrievedFigures);
        }
    }
}
