package inheritance.parent;

import inheritance.Animal;
public class Reptile extends Animal {

    private String dry_skin;
    private String back_bone;
    private String soft_shelled_eggs;

    public Reptile() {
        this.dry_skin = "Yes";
        this.back_bone = "Yes";
        this.soft_shelled_eggs = "Yes";
    }

    public Reptile(double dHeight, Double Weight, String animalType, String bloodType, String dry_skin,String back_bone, String soft_shelled_eggs) {
        super(dHeight, Weight, animalType, bloodType);
        this.dry_skin = dry_skin;
        this.back_bone = back_bone;
        this.soft_shelled_eggs = soft_shelled_eggs;
    }

    public String getDry_skin() {
        return dry_skin;
    }

    public void setDry_skin(String dry_skin) {
        this.dry_skin = dry_skin;
    }

    public String getBack_bone() {
        return back_bone;
    }

    public void setBack_bone(String back_bone) {
        this.back_bone = back_bone;
    }

    public String getSoft_shelled_eggs() {
        return soft_shelled_eggs;
    }

    public void setSoft_shelled_eggs(String soft_shelled_eggs) {
        this.soft_shelled_eggs = soft_shelled_eggs;
    }

    @Override
    public String toString() {
        return "Reptile [dry_skin=" + dry_skin + ", back_bone=" + back_bone + ", soft_shelled_eggs=" + soft_shelled_eggs
                + "]" + BloodType;
    }



}
