package Patterns;

/**
 * Created by OrangeUser on 6/19/2015.
 */

interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Patterns.Circle");
    }

}


abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}

class ShapeBlueDecorator extends ShapeDecorator {

    public ShapeBlueDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setBlueBorder();
    }

    private void setBlueBorder(){
        System.out.println("Blue");
    }


}

public class DecoratorPattern {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape blueCircle = new ShapeBlueDecorator(circle);

        circle.draw();

        blueCircle.draw();


    }

}
