#include<stdio.h>
int main()
{
	int a,b,c;
	a=10;
	b=20;
	c=30;
	
	if(a<b && a<c)
	{
		printf("a is minimum");
	}
	else if(b<c && b<a)
	{
		printf("b is minimun");
	}
	else
	{
		printf("c is minimum");
	}
	
	if(a>b)
	{
		printf("\nb is max");
	}
	else
	{
		printf("\na is max");
	}
	return 0;
}