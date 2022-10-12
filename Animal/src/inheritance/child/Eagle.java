package inheritance.child;

import inheritance.parent.Birds;


public class Eagle extends Birds{
    
  private int number_of_legs;

public Eagle() {
    this.number_of_legs = 2;
}

public Eagle(int number_of_legs) {
    this.number_of_legs = number_of_legs;
}

public Eagle(double dHeight, Double Weight, String animalType, String bloodType, String have_wings,
        String animal_with_feathers, String can_fly, int number_of_wings, int number_of_legs) {
    super(dHeight, Weight, animalType, bloodType, have_wings, animal_with_feathers, can_fly, number_of_wings);
    this.number_of_legs = number_of_legs;
}

public int getNumber_of_legs() {
    return number_of_legs;
}

public void setNumber_of_legs(int number_of_legs) {
    this.number_of_legs = number_of_legs;
}

@Override
public String toString() {
    return "Birds: \nhave wings=" + have_wings + "\nanimal with feathers = " + animal_with_feathers + "\ncan fly = " + can_fly
    + "\nnumber of wings = " + number_of_wings + " Number of legs = " + number_of_legs;
}

}
