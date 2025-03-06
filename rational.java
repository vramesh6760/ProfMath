package profmath;
//rational Class
class rational extends AbstractNumber<rational> {
 int num, den;

 rational(int num, int den) {
     if (den == 0) throw new ArithmeticException("Denominator cannot be zero");
     this.num = num;
     this.den = den;
 }

 @Override
 public rational add(rational other) {
     return new rational(this.num * other.den + other.num * this.den, this.den * other.den);
 }

 @Override
 public rational sub(rational other) {
     return new rational(this.num * other.den - other.num * this.den, this.den * other.den);
 }

 @Override
 public rational mul(rational other) {
     return new rational(this.num * other.num, this.den * other.den);
 }

 @Override
 public rational div(double other) {
     return new rational((int) (this.num / other), this.den);
 }

 @Override
 public rational zero() { return new rational(0, 1); }

 @Override
 public rational value() { return this; }

 @Override
 public String toString() { return String.format("%d/%d", num, den); }
}


