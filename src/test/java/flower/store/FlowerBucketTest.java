package flower.store;
import flower.store.type.Rose;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    /**
    * create object of Random class
    */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * magic number MAX_QUANTITY
     */
    private static final int MAX_QUANTITY = 1000;
    /**
     * magic number MAX_PRICE
     */
    private static final int MAX_PRICE = 100;
    /**
     * variable of class FlowerBucket
     */
    private FlowerBucket flowerBucket;

    /**
     * function that runs before every method
     */
    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    /**
     * tester for price
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
