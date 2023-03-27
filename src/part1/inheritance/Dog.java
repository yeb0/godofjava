package part1.inheritance;

public class Dog extends Animal{
    int teethCount;
    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eatFood() {
        super.eatFood();
    }
    Animal a = new Dog();
//    Dog b = new Animal();
}
