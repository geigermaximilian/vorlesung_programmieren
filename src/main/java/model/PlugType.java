package model;
hier einfügen
public class PlugType {
    private final String description;
    private final String norm;
    private final String region;

    public PlugType(String description, String norm, String region){
        this.description = description;
        this.norm = norm;
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public String getNorm() {
        return norm;
    }

    public String getRegion() {
        return region;
    }


}
