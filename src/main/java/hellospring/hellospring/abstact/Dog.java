package hellospring.hellospring.abstact;

public class Dog extends Animal{
    @Override
    public void sing() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        super.move();
    }
}
