package profmath;
//myDouble Class
class myDouble extends AbstractNumber<myDouble> {
    double x;

    public myDouble(double x) {
        this.x = x;
    }

    @Override
    public myDouble add(myDouble other) {
        return new myDouble(x + other.x);
    }

    @Override
    public myDouble sub(myDouble other) {
        return new myDouble(x - other.x);
    }

    @Override
    public myDouble mul(myDouble other) {
        return new myDouble(x * other.x);
    }

    @Override
    public myDouble div(double other) {
        return new myDouble(x / other);
    }

    @Override
    public myDouble zero() {
        return new myDouble(0.0);
    }

    @Override
    public myDouble one() {
        return new myDouble(1.0);
    }

    @Override
    public myDouble neg() {
        return new myDouble(-x);
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




