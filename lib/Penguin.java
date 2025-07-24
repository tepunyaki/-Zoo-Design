package lib;

public class Penguin extends Bird {
    public Penguin (String name) {
        super (name);
    }

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
          return "Squawk!";
    }
}
