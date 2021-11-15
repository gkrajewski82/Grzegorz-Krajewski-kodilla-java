package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape retrievedShape = null;
        if (n >= 0 && n < shapeCollection.size()) {
            retrievedShape = shapeCollection.get(n);
        }
        return retrievedShape;
    }

    public String showFigures() {
        String retrievedFigures = "";
        for (Shape shapeName : shapeCollection) {
            String name = shapeName.getShapeName();
            retrievedFigures = retrievedFigures + name;
        }
        return retrievedFigures;
    }
}
