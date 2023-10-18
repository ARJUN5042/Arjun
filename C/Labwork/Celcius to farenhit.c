#include<stdio.h>
int main()
{
	double c,f;
	
	printf("Enter Temperature in celcius: ");
	scanf("%lf",&c);
	
	f=(c*9/5)+32;
	
	printf("Temparature in Farenhit is: %.2lf",f);
	
	return 0;
}