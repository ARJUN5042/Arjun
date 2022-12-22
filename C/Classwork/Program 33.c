#include<stdio.h>
void add(int a,int b)
{
	printf("Addition : %d + %d = %d.",a,b,(a+b));
}
void sub(int a,int b)
{
	printf("Subtraction : %d - %d = %d.",a,b,(a-b));
}
void mul(int a,int b)
{
	printf("Multiplication : %d * %d = %d.",a,b,(a*b));
}
void div(int a,int b)
{
	printf("Division : %d / %d = %.2f.",a,b,((float)a/b));
}


void main()
{
	int x,y,n;
	printf("Enter A : ");
	scanf("%d",&x);
	printf("Enter B : ");
	scanf("%d",&y);
	printf("\n\n------------------------------------------\n");
	printf("Choice Menu");
	printf("\n------------------------------------------\n");
	printf("\nPress 1 for Addition");
	printf("\nPress 2 for Subtraction");
	printf("\nPress 3 for Multiplication");
	printf("\nPress 4 for Division");
	printf("\n\nEnter your choice --> ");
	scanf("%d",&n);
	
	if(n==1)
	{
		printf("\n");
		add(x,y);
	}
	else if(n==2)
	{
		printf("\n");
		sub(x,y);
	}
	else if(n==3)
	{
		printf("\n");
		mul(x,y);
	}
	else if(n==4)
	{
		printf("\n");
		div(x,y);
	}
	else
	{
		printf("\nInvalid Input!!!!");
	}
}