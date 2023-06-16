package com.Assignment;

import java.util.Scanner;
//creating class
class Complex 
{
	//initialize data members
    double real;
    double imaginary;
    //creating parameterized constructor
    public Complex(double real, double imaginary) 
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    //creating class method with argument for sum
    public Complex add(Complex other) 
    {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }
    //creating class method with argument for difference
    public Complex subtract(Complex other) 
    {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }
    //creating class method with argument for product
    public Complex product(Complex other) 
    {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realPart, imaginaryPart);
    }
}
public class Q28_RealAndImaginaryParts 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        // Getting user input for the first complex number//real and imaginary
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = sc.nextDouble();

        // Getting user input for the second complex number//real and imaginary
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = sc.nextDouble();
        sc.close();
        // Creating objects of the Complex class
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        // Calculating the sum, difference, and product
        Complex sumResult = complex1.add(complex2);
        Complex differenceResult = complex1.subtract(complex2);
        Complex productResult = complex1.product(complex2);

        // Printing the results
        System.out.println("Sum: " + sumResult.real + " + " + sumResult.imaginary + "i");
        System.out.println("Difference: " + differenceResult.real + " + " + differenceResult.imaginary + "i");
        System.out.println("Product: " + productResult.real + " + " + productResult.imaginary + "i");
	}
}
