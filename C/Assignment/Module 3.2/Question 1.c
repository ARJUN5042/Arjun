#include<stdio.h>
void main()
{
	printf("\n--------------------------------------------");
	printf("\n\t\tSimple Calulator");
	printf("\n--------------------------------------------");
	int n,a,b;
	printf("\n\n\t\tEnter A : ");
	scanf("%d",&a);
	printf("\t\tEnter B : ");
	scanf("%d",&b);
	printf("\n\n\t\tA = %d\tB = %d",a,b);
	printf("\n--------------------------------------------");
	printf("\n\n\t\tMenu");
	printf("\n--------------------------------------------");
	printf("\n\n\t\tPress 1 for Addition");
	printf("\n\t\tPress 2 for Subtraction");
	printf("\n\t\tPress 3 for Multiplication");
	printf("\n\t\tPress 4 for Division");
	printf("\n\t\tPress 5 for Modulus");
	printf("\n\n\t\tEnter your Choice : ");
	scanf("%d",&n);
	
	if(n==1)
	{
		printf("\n\t\tAddition : %d + %d = %d.",a,b,(a+b));
	}
	else if(n==2)
	{
		printf("\n\t\tSubtraction : %d - %d = %d.",a,b,(a-b));
	}
	else if(n==3)
	{
		printf("\n\t\tMultiplication : %d * %d = %d.",a,b,(a*b));
	}
	else if(n==4)
	{
		printf("\n\t\tDivision : %d / %d = %.2f.",a,b,((float)a/b));
	}
	else if(n==5)
	{
		printf("\n\t\tModulus : %d %% %d = %d.",a,b,(a%b));
	}
	else
	{
		printf("\n\t\tInvalid Input!!!");
	}
}