package course.other.topic.reuse;

public class Tailored extends Clothing{
    private double fee;
    public double getFee(){
        return fee;
    }

    @Override
    public double getPriceClothe() {
        return super.getPriceClothe()+fee;
    }

    @Override
    public void setPriceClothe(double priceClothe) {
        super.setPriceClothe(priceClothe);
    }
}
