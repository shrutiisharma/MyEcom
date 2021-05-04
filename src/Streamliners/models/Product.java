package Streamliners.models;

import java.util.List;
import java.util.Objects;

public class Product {

    //common
    public String name, imageURL;
    public int type;

    //WBP
    float minQuantity, pricePerKg;

    //VBP
    public List<Variant> variants;

    //for WBP
    public Product(String name, String imageURL, float pricePerKg, float minQuantity) {
        type = ProductType.TYPE_WB;
        this.name = name;
        this.imageURL = imageURL;
        this.pricePerKg = pricePerKg;
        this.minQuantity = minQuantity;
    }

    //for VBP
    public Product(String name, String imageURL, List<Variant> variants) {
        type = ProductType.TYPE_VB;
        this.name = name;
        this.imageURL = imageURL;
        this.variants = variants;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (type == ProductType.TYPE_WB)
            builder.append("WB {");
        else
            builder.append("VB {");

        builder.append("name = ").append(name);

        if (type == ProductType.TYPE_WB) {
            builder.append(", minQty = ").append(minQuantity);
            builder.append(", pricePerKg = ").append(pricePerKg);
        }
        else
            builder.append(", variants = ").append(variants);

        builder.append(" } ");

        return builder.toString();
    }
}
