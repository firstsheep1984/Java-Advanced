package Bank;

import java.util.Objects;

public class TwoTypePair<T1, T2> {
    private T1 first;
    private T2 second;

    public TwoTypePair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTypePair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoTypePair<?, ?> that = (TwoTypePair<?, ?>) o;
        return Objects.equals(first, that.first) &&
                Objects.equals(second, that.second);
    }

}
