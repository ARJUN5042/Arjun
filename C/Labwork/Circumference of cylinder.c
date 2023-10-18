#include<stdio.h>
void main()
{
	double r,h,d,c;
	printf("Enter radius: ");
	scanf("%lf",&r);
	printf("Enter height: ");
	scanf("%lf",&h);
	d=2*r;
	c=2*(d+h);
	printf("Circumference of Cylinder: %.2lf",c);
}