package flower.store.type;
import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

public class Chamomile extends Flower {
    public static final int CHAMOMILE_SEPAL_LENGTH = 3;
    public static final int COEFF = 5;

    public Chamomile() {
        setFlowerType(FlowerType.CHAMOMILE);
        setColor(FlowerColor.WHITE);
        setSepalLength(CHAMOMILE_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
