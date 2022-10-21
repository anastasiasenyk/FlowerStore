package flower.store.type;
import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

public class Tulip extends Flower {
    public static final int ROSE_SEPAL_LENGTH = 11;
    public static final int COEFF = 5;

    public Tulip() {
        setFlowerType(FlowerType.TULIP);
        setColor(FlowerColor.BLUE);
        setSepalLength(ROSE_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
