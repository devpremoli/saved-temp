package com.example.shape_client;

import com.example.shape.Shape;
import com.example.shape.ShapeFactory;

class ShapeFactoryDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeC = shapeFactory.getShape("C");
        Shape shapeR = shapeFactory.getShape("R");
        Shape shapeS = shapeFactory.getShape("S");

        shapeC.draw();
        shapeR.draw();
        shapeS.draw();
    }    
}
