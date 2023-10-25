import org.w3c.dom.ls.LSOutput;

public class Pair<T> {

    private T value1;

    private T value2;
    public Pair(T v1, T v2) {
        this.value1 = v1;
        this.value2 = v2;

    }

    public T getFirst() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public T getSecond() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "value1="+ String.valueOf(value1) +", value2=" + String.valueOf(value2)+";";
    }
}
