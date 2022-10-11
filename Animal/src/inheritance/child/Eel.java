package inheritance.child;

import inheritance.parent.Fish;


public class Eel {

    private String release_electric_eggs;
    private String show_info;

  
    public Eel(){
        this.release_electric_eggs = "No";
        this.show_info = "Yes";
    }

    public Eel(String release_electric_eggs, String show_info) {
        this.release_electric_eggs = release_electric_eggs;
        this.show_info = show_info;
    }

    public String getRelease_electric_eggs() {
        return release_electric_eggs;
    }

    public void setRelease_electric_eggs(String release_electric_eggs) {
        this.release_electric_eggs = release_electric_eggs;
    }

    public String getShow_info() {
        return show_info;
    }

    public void setShow_info(String show_info) {
        this.show_info = show_info;
    }

    @Override
    public String toString() {
        return "Eagle: release electric eggs = " + release_electric_eggs + ", show_info = " + show_info;
    }

}
