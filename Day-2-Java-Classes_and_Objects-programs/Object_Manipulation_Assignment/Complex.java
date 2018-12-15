
public class Complex {
	double real;
	double imaginary;
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex() {
	}
	public void display() { 
		System.out.println(real+"+"+imaginary+"i");
	}
	public static Complex sum(Complex complex1, Complex complex2) {
		Complex result = new Complex();
		result.real = complex1.real + complex2.real;
		result.imaginary = complex1.imaginary + complex2.imaginary;
		return result;
	}

}
