package hellospring.hellospring.abstact;

public class Cat extends Animal{

    @Override
    public void sing() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        super.move();
    }
}
