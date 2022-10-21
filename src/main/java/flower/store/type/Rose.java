package flower.store.type;
import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

public class Rose extends Flower {
    public static final int ROSE_SEPAL_LENGTH = 7;
    public static final int COEFF = 5;

    public Rose() {
        setFlowerType(FlowerType.ROSE);
        setColor(FlowerColor.RED);
        setSepalLength(ROSE_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
