import inheritance.child.Eagle;
import inheritance.child.Eel;
import inheritance.child.Crocodile;

public class Animal {
    public static void main(String[] args) throws Exception {
        Eel Eel = new Eel();
        System.out.println(Eel);
        System.out.println("<---------------------->");
        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile);
        System.out.println("<---------------------->");
        Eagle bird = new Eagle();
        System.out.println(bird);
        System.out.println("<---------------------->");
        Eagle bird1 = new Eagle();
        System.out.println(bird1);



    }
}
