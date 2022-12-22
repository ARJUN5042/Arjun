#include<stdio.h>

int add(int a, int b)
{
	return a+b;
}


void main()
{
	int res,a,b;
	printf("Enter A : ");
	scanf("%d",&a);
	printf("\nEnter B : ");
	scanf("%d",&b);
	res=add(a,b);
	printf("\nAddition of %d + %d is : %d.\n\n",a,b,res);
	if(res%2==0)
	{
		printf("%d is an Even.",res);
	}
	else
	{
		printf("%d is an Odd.",res);
	}
	
	
}