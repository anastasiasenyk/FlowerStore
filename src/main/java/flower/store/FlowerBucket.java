package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Setter @Getter
public class FlowerBucket {
    /**
     * price of bucket (all flowers).
     */
    private double price;
    /**
     * array of packs.
     */
    private ArrayList<FlowerPack> bucket = new ArrayList<FlowerPack>();

    /**
     * add pack of flower and their amount to the bucket.
     * @param pack flower pack
     */
    public void add(final FlowerPack pack) {
        bucket.add(pack);
        setPrice(pack.getAmount() * pack.getFlower().getPrice());
    }
}
