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
    private Integer amount;

    /**
     * constuctor for flower and quantity.
     */
    public FlowerPack(Flower flower, Integer quantity) {
        setFlower(flower);
        setAmount(quantity);
    }

}