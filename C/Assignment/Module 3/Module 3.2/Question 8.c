#include<stdio.h>
void main()
{
	int i,n,fact=1;
	printf("---------------------------------------------------------------\n");
	printf("\t\t # Factorial Number #\n");
	printf("---------------------------------------------------------------\n");
	printf("\t\t Enter your number : ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	printf("\n\t\t Factorial of %d! = %d.",n,fact);
}