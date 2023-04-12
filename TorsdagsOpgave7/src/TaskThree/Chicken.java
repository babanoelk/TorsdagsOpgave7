package TaskThree;

public class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "buk buk";
    }

    @Override
    public String howToEat() {
        return "Naum naum";
    }
}
