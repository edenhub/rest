package pri.annontation.demo03;

/**
 * Created by adam on 14-11-22.
 */
public class Apple {

    @FruitName("apple")
    private String fruitName;

    @FruitColor(FruitColor.Color.Red)
    private FruitColor.Color color;

    @FruitProivter(id = "0001",proviterName = "adam",comparyName = "SYSU")
    private Proviter proviter;

    private String date;

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public FruitColor.Color getColor() {
        return color;
    }

    public void setColor(FruitColor.Color color) {
        this.color = color;
    }

    public Proviter getProviter() {
        return proviter;
    }

    public void setProviter(Proviter proviter) {
        this.proviter = proviter;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "fruitName='" + fruitName + '\'' +
                ", color=" + color +
                ", proviter=" + proviter +
                ", date='" + date + '\'' +
                '}';
    }
}
