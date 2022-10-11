package inheritance.child;

import inheritance.parent.Birds;


public class Eagle {
    
  private String show_info;


  public Eagle() {
    this.show_info = "Yes";
}

public Eagle(String show_info) {
    this.show_info = show_info;
}

public String getShow_info() {
    return show_info;
}

public void setShow_info(String show_info) {
    this.show_info = show_info;
}

@Override
public String toString() {
    return "Eagle: show info = " + show_info;
}

}
