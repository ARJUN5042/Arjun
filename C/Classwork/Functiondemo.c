#include<stdio.h>
void func1();
void func2();
void main()
{
	func1();
	func2();
}
void func1()
{
	printf("\nFunction 1 is called.");
}
void func2()
{
	printf("\nFunction 2 is called.");
}