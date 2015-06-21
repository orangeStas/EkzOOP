package Patterns;

interface Visitor {
    public void visit(Wild wild);

}

abstract class Wild {
    private String name;

    private String ownerName;

    public abstract void accept(Visitor visitor);

    public Wild(String name) {
        this.name = name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }
}

class Cat extends Wild {

    public Cat(String name) {
        super(name);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

class Dog extends Wild {

    public Dog(String name) {
        super(name);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

class VisitorRealization implements Visitor {

    @Override
    public void visit(Wild wild) {
        wild.setOwnerName(wild.getClass().getSimpleName() + " Owner");
    }

}

public class VisitorPattern {
    public static void main ( String [] args ) {
        Wild cat = new Cat("Cat");
        Wild dog = new Dog("Dog");

        VisitorRealization visitorRealization = new VisitorRealization();

        cat.accept(visitorRealization);
        dog.accept(visitorRealization);

        System.out.println(cat.getOwnerName());
        System.out.println(dog.getOwnerName());
    }
}
