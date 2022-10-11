package inheritance.parent;

public class Fish {
   
    private String live_in_water;
    private String has_gills;

    public Fish(){
        this.live_in_water = "Yes";
        this.has_gills = "Yes";
    }

    public Fish(String live_in_water, String has_gills) {
        this.live_in_water = live_in_water;
        this.has_gills = has_gills;
    }

    public String getLive_in_water() {
        return live_in_water;
    }

    public void setLive_in_water(String live_in_water) {
        this.live_in_water = live_in_water;
    }

    public String getHas_gills() {
        return has_gills;
    }

    public void setHas_gills(String has_gills) {
        this.has_gills = has_gills;
    }

    @Override
    public String toString() {
        return "Fish: live in water = " + live_in_water + ", has gills = " + has_gills;
    }

}
