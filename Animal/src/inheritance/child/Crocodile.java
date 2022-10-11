package inheritance.child;

import inheritance.parent.Reptile;

public class Crocodile {
    
    private String hard_shelled_eggs;
    private String show_info;

    public Crocodile(){
        this.hard_shelled_eggs = "Yes";
        this.show_info = "yes";
    }

    public Crocodile(String hard_shelled_eggs, String show_info) {
        this.hard_shelled_eggs = hard_shelled_eggs;
        this.show_info = show_info;
    }

    public String getHard_shelled_eggs() {
        return hard_shelled_eggs;
    }

    public void setHard_shelled_eggs(String hard_shelled_eggs) {
        this.hard_shelled_eggs = hard_shelled_eggs;
    }

    public String getShow_info() {
        return show_info;
    }

    public void setShow_info(String show_info) {
        this.show_info = show_info;
    }

    @Override
    public String toString() {
        return "Crocodile: hard shelled eggs = " + hard_shelled_eggs + ", show info = " + show_info;
    }
    
}
