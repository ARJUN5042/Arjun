#include<stdio.h>
int main()
{
	double c,f;
	
	printf("Enter Temperature in farenhit: ");
	scanf("%lf",&f);
	
	c=(5/9)*(f-32);
	
	printf("Temparature in Celcius is: %.2lf",c);
	
	return 0;
}