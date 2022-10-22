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
     */
    public FlowerPack(final Flower flower1, final int quantity) {
        setFlower(flower1);
        setAmount(quantity);
    }

}
