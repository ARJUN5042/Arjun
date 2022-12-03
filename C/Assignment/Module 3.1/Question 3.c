#include<stdio.h>
void main()
{
	int choice;
	const float PI=3.141;
	float area,r,w,h,b;
	printf("\n---------------------------------------------------");
	printf("\n\t\t# Choice Menu #");
	printf("\n---------------------------------------------------");	
	printf("\n\t\t1.Area of Circle.");
	printf("\n\t\t2.Area of Rectangle.");
	printf("\n\t\t3.Area of Triangle.");
	printf("\n---------------------------------------------------");
	printf("\n\t\tEnter Your Choise : ");
	scanf("%d",&choice);
	printf("\n---------------------------------------------------");
	
	if(choice==1)
	{
		printf("\n\t\tEnter Radius : ");
		scanf("%f",&r);
		area=PI*r*r;
		printf("\n\t\tArea of Circle is %.3f.",area);
	}
	else if(choice==2)
	{
		printf("\n\t\tEnter Width : ");
		scanf("%f",&w);
		printf("\n\t\tEnter Height : ");
		scanf("%f",&h);
		area=w*h;
		printf("\n\t\tArea of Rectangle is %.2f.",area);
	}
	else if(choice==3)
	{
		printf("\n\t\tEnter Base : ");
		scanf("%f",&b);
		printf("\n\t\tEnter Height : ");
		scanf("%f",&h);
		area=(b*h)/2;
		printf("\n\t\tArea of Triangle is %.2f.",area);
	}
	else
	{
		printf("\n\t\tInvalid Input!!!");
	}
}