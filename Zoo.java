import java.util.ArrayList;
import lib.*;


public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Lion("pang"));
        zoo.add(new Eagle("JJ"));
        zoo.add(new Penguin("Aomkung"));
        zoo.add(new Dolphin("tung O"));

        for (Animal animal : zoo){
            System.out.println(animal.getName());
            System.out.println(animal.makeSound());
        }

        for (Animal animal : zoo){
            if(animal instanceof Flyable){
                System.out.println(((Flyable)animal).fly());
    
            } else if (animal instanceof Swimmable){
                System.out.println(((Swimmable)animal).swim());
            } else System.out.println("walk");
        }
    }
}
