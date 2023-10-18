#include<stdio.h>
void main()
{
	int l,area,circum;
	
	printf("Enter length: ");
	scanf("%d",&l);
	
	area=l*l;
	circum=4*l;
	printf("Area of Circle is: %d\n",area);
	printf("Circumference of circle is: %d",circum);
}