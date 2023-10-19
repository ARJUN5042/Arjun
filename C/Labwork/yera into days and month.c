#include<stdio.h>
int main()
{
	float year;
	int days,months;
	printf("Enter year: ");
	scanf("%f",&year);
	
	months=year*12;
	days=year*365;
	
	printf("%.2f Year have %.2f months\n",year,months);
	printf("%.2f Year have %d days",year,days);
	
	
	return 0;
}