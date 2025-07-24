package lib;

public class Penguin extends Bird implements Swimmable {
    public Penguin (String name) {
        super (name);
    }

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
          return "Squawk!";
    }

    @Override
    public String swim() {
        // TODO Auto-generated method stub
        return "The penguin dives gracefully in the water." ;
    }
}
