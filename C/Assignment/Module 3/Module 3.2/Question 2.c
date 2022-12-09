#include<stdio.h>
void main()
{
	int a,b;
	printf("\n\t\tEnter A : ");
	scanf("%d",&a);
	printf("\t\tEnter B : ");
	scanf("%d",&b);
	printf("\n\t\tBefore Swap : A = %d\tB = %d",a,b);
	a=a+b;
	b=a-b;
	a=a-b;	
	printf("\n\t\tAfter Swap  : A = %d\tB = %d",a,b);
}