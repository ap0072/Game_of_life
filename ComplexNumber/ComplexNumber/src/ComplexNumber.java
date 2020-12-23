import java.util.Scanner;

/**
 * The ComplexNumber class should provide basic operations such as 
 * addition, subtraction, multiplication and division.
 * 
 * 
 * @author Sridevi. K.
 * @author N. D. V. Siva Sankar
 * @author <Student Name>
 * 
 * @version: 1.0
 */

public class ComplexNumber {

	//	Declare the attributes of the class below and write the documentation
	// comments for the declared attributes..

	/**
	 * The attribute of the class real indicates the real part of the complex 
	 * number which is of double type.
	 */
	private double real;

	/**
	 * The attribute of the class imag indicates the imag part of the complex 
	 * number which is of double type.
	 */
	private double imag;

	/**
	 * The following is a parameterized constructor that sets up the default
	 * values for real and imaginary parts of a complex number.
	 * 
	 * @param real: The real part of this complex number.
	 * @param imag: The imag part of this complex number.
	 */
	public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
	}

	/**
	 * This method performs the addition of two complex numbers and returns the 
	 * result as as complex number which of this (ComplexNumber) class object.
	 * 
	 * @param r2: The second ComplexNumber object.
	 * @return ComplexNumber object.
	 */
	public ComplexNumber add(ComplexNumber r1) {
		return (new ComplexNumber(this.real + r1.real, this.imag + r1.imag));
	}

	/**
	 * This method performs the subtraction of two complex numbers and 
	 * returns the result as as complex number which of this (ComplexNumber) 
	 * class object.
	 * 
	 * @param r2: The second ComplexNumber object.
	 * @return ComplexNumber object.
	 */
	public ComplexNumber subtract(ComplexNumber r1) {
		return (new ComplexNumber(this.real - r1.real, this.imag - r1.imag));
	}

	/**
	 * This method performs the multiplication of two complex numbers and 
	 * returns the result as as complex number which of this (ComplexNumber) 
	 * class object.
	 * 
	 * @param r2: The second ComplexNumber object.
	 * @return ComplexNumber object.
	 */
	public ComplexNumber multiply(ComplexNumber r1) {
        return (new ComplexNumber(
                this.real * r1.real + 
                this.imag * r1.imag * -1,
                this.real * r1.imag + this.imag * r1.real));
	}

	/**
	 * This method performs the multiplication of two complex numbers and 
	 * returns the result as as complex number which of this (ComplexNumber) 
	 * class object.
	 * 
	 * @return String: the string version of the ComplexNumber object.
	 * Following is the string version. real + imag i
	 * Example:
	 * 		3.0 + 4.0i
	 * 		6.0 - 4.0i
	 * 		0.0 + 1.0i
	 */
	public String toString() {
		if (this.real == 0 && this.imag == 0)
			return "0.0";
		else if (this.real == 0)
			return this.imag + "i";
		else if (this.imag == 0)
			return this.real + "";
		else if (this.imag < 0)
            return this.real + " - " + (this.imag)*-1 + "i";
        else
            return this.real + " + " + this.imag + "i";
	}
}