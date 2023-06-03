package com.Assignment;

import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realPart, imaginaryPart);
    }
}
public class Q28_RealAndImaginaryParts 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        // Getting user input for the first complex number
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        // Getting user input for the second complex number
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        // Creating instances of the Complex class
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        // Calculating the sum, difference, and product
        Complex sumResult = complex1.add(complex2);
        Complex differenceResult = complex1.subtract(complex2);
        Complex productResult = complex1.multiply(complex2);

        // Printing the results
        System.out.println("Sum: " + sumResult.getReal() + " + " + sumResult.getImaginary() + "i");
        System.out.println("Difference: " + differenceResult.getReal() + " + " + differenceResult.getImaginary() + "i");
        System.out.println("Product: " + productResult.getReal() + " + " + productResult.getImaginary() + "i");
	}
}
