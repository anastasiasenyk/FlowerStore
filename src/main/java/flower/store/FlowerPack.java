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
    public FlowerPack(Flower flower_new, int quantity) {
        setFlower(flower_new);
        setAmount(quantity);
    }

}