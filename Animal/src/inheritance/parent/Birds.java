package inheritance.parent;

public class Birds {
protected String have_wings;   
protected String animal_with_feathers;
protected String can_fly;
protected int number_of_wings;

public Birds(){
    this.animal_with_feathers = "Yes";
    this.can_fly = "No";
    this.have_wings = "Yes";
    this.number_of_wings = 2;
}

public Birds(String animal_with_feathers, String can_fly, String havve_wings, int number_of_wings) {
    this.animal_with_feathers = animal_with_feathers;
    this.can_fly = can_fly;
    this.have_wings = have_wings;
    this.number_of_wings = number_of_wings;
}

public String getHave_wings() {
    return have_wings;
}

public void setHave_wings(String have_wings) {
    this.have_wings = have_wings;
}

public int getNumber_of_wings() {
    return number_of_wings;
}

public void setNumber_of_wings(int number_of_wings) {
    this.number_of_wings = number_of_wings;
}

public String getAnimal_with_feathers() {
    return animal_with_feathers;
}

public void setAnimal_with_feathers(String animal_with_feathers) {
    this.animal_with_feathers = animal_with_feathers;
}

public String getCan_fly() {
    return can_fly;
}

public void setCan_fly(String can_fly) {
    this.can_fly = can_fly;
}

@Override
public String toString() {
    return "Birds: \nhave wings=" + have_wings + "\nanimal with feathers = " + animal_with_feathers + "\ncan fly = " + can_fly
            + "\nnumber of wings = " + number_of_wings;
}


}
