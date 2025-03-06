package profmath;

class myInteger extends AbstractNumber<myInteger> {
    int x;

    public myInteger(int x) {
        this.x = x;
    }

    @Override
    public myInteger add(myInteger other) {
        return new myInteger(x + other.x);
    }

    @Override
    public myInteger sub(myInteger other) {
        return new myInteger(x - other.x);
    }

    @Override
    public myInteger mul(myInteger other) {
        return new myInteger(x * other.x);
    }

    @Override
    public myInteger div(double other) {
        return new myInteger((int) (x / other));
    }

    @Override
    public myInteger zero() {
        return new myInteger(0);
    }

    @Override
    public myInteger one() {
        return new myInteger(1);
    }

    @Override
    public myInteger neg() {
        return new myInteger(-x);
    }

    @Override
    public double doubleValue() {
        return x;
    }
    @Override
    public String toString() {
        return String.valueOf(x);
    }
}



