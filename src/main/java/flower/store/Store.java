package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class Store {
    /**
     * arraylist of all FlowerBucket in store.
     */
    private ArrayList<FlowerBucket> store = new ArrayList<FlowerBucket>();

    /**
     * add Bucket to the store.
     * @param bucket bucket
     */
    public void addBucket(final FlowerBucket bucket) {
        store.add(bucket);
    }

    /**
     * search amount of needed flowers in store.
     * @return boolean - if amount of needed flowers are in the store
     * @param amount amount of needed flowers
     * @param flower flower of neede type
     */
    public boolean search(final Flower flower, final int amount) {
        int counter = 0;
        for (FlowerBucket bucket: store) {
            for (FlowerPack pack: bucket.getBucket()) {
                if (pack.getFlower().getFlowerType() == flower.getFlowerType()) {
                    counter += pack.getAmount();
                }
                if (counter >= amount) {
                    return true;
                }
            }
        }
        return false;
    }
}
