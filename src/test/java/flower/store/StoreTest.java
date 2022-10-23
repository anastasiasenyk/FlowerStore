package flower.store;
import flower.store.type.Chamomile;
import flower.store.type.Rose;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class StoreTest {
    /**
     * create object of Random class.
     */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * magic number MAX_QUANTITY.
     */
    private static final int MAX_QUANTITY = 10;
    /**
     * magic number MAX_PRICE.
     */
    private static final int MAX_PRICE = 100;
    /**
     * object of class Store.
     */
    private Store store;

    /**
     * function that runs before every method.
     */
    @BeforeEach
    public void init() {
        store = new Store();
    }

    /**
     * tester for search.
     */
    @Test
    public void testSearch() {
        int firstPrice = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int firstQuantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY) + 1;
        int secondPrice = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int secondQuantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY) + 1;

        Flower firstFlower = new Rose();
        firstFlower.setPrice(firstPrice);
        FlowerPack firstPack = new FlowerPack(firstFlower, firstQuantity);

        Flower secondFlower = new Chamomile();
        secondFlower.setPrice(secondPrice);
        FlowerPack secondPack = new FlowerPack(secondFlower, secondQuantity);

        FlowerBucket firstBucket = new FlowerBucket();
        FlowerBucket secondBucket = new FlowerBucket();

        firstBucket.add(firstPack);
        firstBucket.add(secondPack);

        secondBucket.add(firstPack);

        store.addBucket(firstBucket);
        store.addBucket(secondBucket);

        Assertions.assertTrue(store.search(firstFlower,
                firstQuantity * 2));
        Assertions.assertTrue(store.search(secondFlower,
                secondQuantity));
        Assertions.assertFalse(store.search(firstFlower,
                firstQuantity * 2 + 1));
        Assertions.assertFalse(store.search(secondFlower,
                secondQuantity + 1));
    }

}
