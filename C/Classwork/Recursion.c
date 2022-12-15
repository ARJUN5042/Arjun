#include<stdio.h>
void f1();
void f2();
void main()
{
	f1();
	f2();
}
void f1()
{
	printf("\nFunction 1 is called.");
}
void f2()
{
	f1();
	printf("\nFunction 2 is called.");
	f2();
}