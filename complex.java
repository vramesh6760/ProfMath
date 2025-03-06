package profmath;
//complex Class
class complex extends AbstractNumber<complex> {
 double real, imag;

 complex(double real, double imag) {
     this.real = real;
     this.imag = imag;
 }

 @Override
 public complex add(complex other) { return new complex(this.real + other.real, this.imag + other.imag); }

 @Override
 public complex sub(complex other) { return new complex(this.real - other.real, this.imag - other.imag); }

 @Override
 public complex mul(complex other) {
     return new complex(this.real * other.real - this.imag * other.imag, this.real * other.imag + this.imag * other.real);
 }

 @Override
 public complex div(double other) { return new complex(this.real / other, this.imag / other); }

 @Override
 public complex zero() { return new complex(0.0, 0.0); }

 @Override
 public complex value() { return this; }

 @Override
 public String toString() {
     return String.format("(%.3f + %.3fi)", real, imag);
 }
}



