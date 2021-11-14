package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape) {
        //temporarily do nothing
    }

    public boolean removeFigure(Shape shape) {
        //temporarily
        return true;
    }

    public Shape getFigure(int n) {
        //temporarily
        return null;
    }

    public String showFigures() {
        //temporarily
        return "aaa";
    }
}
