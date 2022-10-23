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
     * @param flower1 - get param of type Flower
     * @param quantity  - get int param of amount flowers in pack
     */
    public FlowerPack(final Flower flower1, final int quantity) {
        setFlower(flower1);
        setAmount(quantity);
    }

}
