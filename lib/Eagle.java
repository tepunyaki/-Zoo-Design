package lib;

public class Eagle extends Bird implements Flyable   {
    public Eagle (String name){
        super (name);
    }

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
         return "Screech!";
    }
}
