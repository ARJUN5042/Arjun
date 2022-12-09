#include<stdio.h>
void main()
{
	printf("\n\t\tYear and Day Converter");
	int a;
	float day,year;
	printf("\n\n\t\t1. Years to Day");
	printf("\n\t\t2. Days to Year");
	printf("\n\n\t\tEnter your choice : ");
	scanf("%d",&a);
	if(a==1)
	{
		printf("\n\t\tEnter Year : ");
		scanf("%f",&year);
		day=year*365;
		printf("\n\t\tDays is %.1f.",(float)day);
	}
	else if(a==2)
	{
		printf("\n\t\tEnter Day : ");
		scanf("%f",&day);
		year=day/365;
		printf("\n\t\tYear is %.2f.",year);
	}
	else
	{
		printf("\n\t\tInvalid Input!!!");
	}
}