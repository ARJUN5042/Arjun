#include<stdio.h>
void main()
{
	double l,w,h,area;
	
	printf("Enter length: ");
	scanf("%lf",&l);
	printf("Enter width: ");
	scanf("%lf",&w);
	printf("Enter height: ");
	scanf("%lf",&h);
	
	area=2*((l*w)+(w*h)+(h*l));
	printf("Area of Rectangular Prism is: %.2lf",area);
}