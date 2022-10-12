import inheritance.child.Eagle;
import inheritance.child.Eel;
import inheritance.child.Crocodile;
import inheritance.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        Eel Eel = new Eel();
        System.out.println(Eel);
        System.out.println("<---------------------->");
        Crocodile crocodile = new Crocodile(5.5,6.2,"Reptile","B+","Yes","Yes","Yes", "Yes", "Yes");
        System.out.println(crocodile);
        System.out.println("<---------------------->");
        Eagle bird = new Eagle();
        System.out.println(bird);
        System.out.println("<---------------------->");
        Eagle bird1 = new Eagle();
        System.out.println(bird1);
        System.out.println("<---------------------->");
        Animal animal = new Animal(5.5,6.7,"crocodile","B+");
        System.out.println(animal);

       
    }
    
}
