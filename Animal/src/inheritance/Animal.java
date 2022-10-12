package inheritance;

    public class Animal {

    protected double Height;
    protected double Weight;
    protected String AnimalType;
    protected String BloodType;

    public Animal(){}

    public Animal(double dHeight, Double weight, String animalType, String bloodType) {
        Height = dHeight;
        Weight = weight;
        AnimalType = animalType;
        BloodType = bloodType;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String getAnimalType() {
        return AnimalType;
    }

    public void setAnimalType(String animalType) {
        AnimalType = animalType;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Animal [Height=" + Height + ", Weight=" + Weight + ", AnimalType=" + AnimalType + ", BloodType="
                + BloodType + "]";
    }

    
}