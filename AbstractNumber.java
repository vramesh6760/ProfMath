package profmath;


abstract class AbstractNumber<T extends AbstractNumber<T>> implements Comparable<T> {
    public abstract T add(T other);
    public abstract T sub(T other);
    public abstract T mul(T other);
    public abstract T div(double other);
    public abstract T zero();
    public abstract T one();
    public abstract T neg();

    @Override
    public int compareTo(T other) {
        return Double.compare(this.doubleValue(), other.doubleValue());
    }

    public abstract double doubleValue();
}

