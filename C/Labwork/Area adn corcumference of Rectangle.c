#include<stdio.h>
void main()
{
	double l,w,a,circum;
	
	printf("Enter length: ");
	scanf("%lf",&l);
	
	printf("Enter width: ");
	scanf("%lf",&w);
	
	a=l*w;
	circum=2*(l+w);
	
	printf("Area: %.2lf\n",a);
	printf("Circumference: %.2lf",circum);
}