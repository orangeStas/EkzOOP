package Patterns;

/**
 * Created by OrangeUser on 6/19/2015.
 */

interface Drawer {
    void drawCircle(int x, int y, int rad);
}

class SmallCircleDrawer implements Drawer {

    public static final double proportion = 0.25;

    @Override
    public void drawCircle(int x, int y, int rad) {
        System.out.println("Circle: " + x + "-" + y + "-" + rad*proportion);
    }
}

class LargeCircleDrawer implements Drawer {

    public static final int proportion = 5;

    @Override
    public void drawCircle(int x, int y, int rad) {
        System.out.println("Circle: " + x + "-" + y + "-" + rad*proportion);
    }
}

abstract class Shape1 {
    protected Drawer drawer;

    protected Shape1(Drawer drawer){
        this.drawer = drawer;
    }

    public abstract void draw();

}

class Circle1 extends Shape1{

    private int x;

    private int y;

    private int radius;

    public Circle1(int x, int y, int radius, Drawer drawer) {
        super(drawer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawer.drawCircle(x, y, radius);
    }


}

public class BridgePattern {

    public static void main (String [] args){
        Shape1 [] shapes = {
                new Circle1(5,10,10, new LargeCircleDrawer()),
                new Circle1(20,30,100, new SmallCircleDrawer())};

        for (Shape1 next : shapes){
            next.draw();
        }
    }

}
