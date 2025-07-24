package lib;

public class Dolphin extends Mammal implements Swimmable  {
    public Dolphin (String name ){
        super (name);
    }

    @Override
    public String makeSound() {
        return "Clicking sounds";
    }

    @Override
    public String swim() {
        // TODO Auto-generated method stub
        return "The dolphin playfully swims in the sea." ;
    }
}
