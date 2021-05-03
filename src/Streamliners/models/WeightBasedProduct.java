package Streamliners.models;

public class WeightBasedProduct extends Product{
    float pricePerKg, minQuantity;

    public WeightBasedProduct(String name, String imageURL, float pricePerKg, float minQuantity) {
        super(name, imageURL);
        this.pricePerKg = pricePerKg;
        this.minQuantity = minQuantity;
    }

    @Override
    public String toString() {
        return "WeightBasedProduct{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", pricePerKg=" + pricePerKg +
                ", minQuantity=" + minQuantity +
                '}';
    }
}
