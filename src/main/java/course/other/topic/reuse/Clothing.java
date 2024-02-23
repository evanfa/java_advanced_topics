package course.other.topic.reuse;

public class Clothing extends Object {
    private String typeClothe;
    private String sizeClothe;
    private String brandClothe;
    private double priceClothe;

    public double getPriceClothe() {
        return priceClothe;
    }

    public void setPriceClothe(double priceClothe) {
        this.priceClothe = priceClothe;
    }

    public String getTypeClothe() {
        return typeClothe;
    }

    public void setTypeClothe(String typeClothe) {
        this.typeClothe = typeClothe;
    }

    public String getSizeClothe() {
        return sizeClothe;
    }

    public void setSizeClothe(String sizeClothe) {
        this.sizeClothe = sizeClothe;
    }

    public String getBrandClothe() {
        return brandClothe;
    }

    public void setBrandClothe(String brandClothe) {
        this.brandClothe = brandClothe;
    }

    public  Clothing(){

    }
    public Clothing(String typeClothe, String sizeClothe, String brandClothe, double priceClothe) {
        this.typeClothe = typeClothe;
        this.sizeClothe = sizeClothe;
        this.brandClothe = brandClothe;
        this.priceClothe = priceClothe;
    }
}
