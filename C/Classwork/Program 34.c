#include<stdio.h>

int add(int a, int b)
{
	printf("In function A = %d\tB = %d.\n",a,b);
	return a+b;
}

void main()
{
	 int res;
	 res=add(10,30);
	printf("\n\nAddition is %d.",res);
	if(res%2==0)
	{
		printf("\n\n%d is Even.\n",res);
	}
	else
	{
		printf("\n\n%d is an Odd.\n",res);
	}
}