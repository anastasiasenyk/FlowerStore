package flower.store;

import lombok.Getter;
import lombok.Setter;


@Setter @Getter
public class FlowerBucket {
    /**
     * price of bucket (all flowers).
     */
    private double price;

    /**
     * add pack of flower and their amount to the bucket.
     */
    public void add(FlowerPack pack) {
        setPrice(pack.getAmount() * pack.getFlower().getPrice());
    }
}