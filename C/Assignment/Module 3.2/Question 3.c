#include<stdio.h>
void main()
{
	int n;
	printf("\n\t\tEnter Number : ");
	scanf("%d",&n);
	n%2==0?printf("%\n\t\t%d is Even.",n):printf("\n\t\t%d is Odd.",n);
}