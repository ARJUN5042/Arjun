#include<stdio.h>
void f1(int i)
{
	printf("In Function A : %d",i);
}
void main()
{
	int n;
	printf("\nEnter Number : ");
	scanf("%d",&n);
	f1(n);
}