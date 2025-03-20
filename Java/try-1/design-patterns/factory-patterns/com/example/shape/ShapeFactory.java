package com.example.shape;

public class ShapeFactory {

        // Method to get the appropriate shape object based on input
        public Shape getShape(String shapeType) {
            if (shapeType == null) {
                return null;
            }
    
            if (shapeType.equalsIgnoreCase("C")) {
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("R")) {
                return new Rectangle();
            } else if (shapeType.equalsIgnoreCase("S")) {
                return new Square();
            }
    
            return null; // return null if no matching shape is found
        }
    
}
