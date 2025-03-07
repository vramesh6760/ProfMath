package profmath;


public class Vector {
    private double[] data;

    public Vector(int size) {
        this.data = new double[size];
    }

    public Vector(double[] data) {
        this.data = data;
    }

    public double get(int i) {
        return data[i];
    }

    public void set(int i, double value) {
        data[i] = value;
    }

    public double dot(Vector other) {
        if (data.length != other.data.length) {
            throw new IllegalArgumentException("Vector dimensions do not match");
        }
        double result = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            result += data[i] * other.get(i);
        }
        return result;
    }
}


