package inheritance.parent;

public class Birds {
    
private String animal_with_feathers;
private String can_fly;

public Birds(){
    this.animal_with_feathers = "Yes";
    this.can_fly = "No";
}

public Birds(String animal_with_feathers, String can_fly) {
    this.animal_with_feathers = animal_with_feathers;
    this.can_fly = can_fly;
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
    return "Birds: animal with feathers = " + animal_with_feathers + ", can fly = " + can_fly;
}

}
