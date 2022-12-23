#include<stdio.h>
int fact(int n)
{
	if(n==0)
	return 1;
	else
	return (n*fact(n-1));
}

void main()
{
	int n,f;
	printf("\nEnter your Number : ");
	scanf("%d",&n);
	f=fact(n);
	printf("Factorial of %d is : %d",n,f);
}