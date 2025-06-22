package june21;

public class Box<T,R>{

    private T item1;
    private R item2;

    public Box(T item1, R item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }
}
