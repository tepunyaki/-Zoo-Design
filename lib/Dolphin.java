package lib;

public class Dolphin extends Mammal implements Swimmable  {
    public Dolphin (String name ){
        super (name);
    }

    @Override
    public String makeSound() {
        return "Clicking sounds";
    }
}
