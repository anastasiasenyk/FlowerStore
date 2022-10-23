package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class FlowerPack {
    /**
     * flower in pack.
     */
    private Flower flower;
    /**
     * numbers of flowers.
     */
    private int amount;

    /**
     * constuctor for flower and quantity.
     * @param flowerNew - get param of type Flower
     * @param quantity  - get int param of amount flowers in pack
     */
    public FlowerPack(final Flower flowerNew, final int quantity) {
        setFlower(flowerNew);
        setAmount(quantity);
    }

}
