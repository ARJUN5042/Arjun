#include<stdio.h>
int main()
{
	int a;
	printf("Enter number: ");
	scanf("%d",&a);
	
	printf("Number is: %d",a);
	printf("Ascii value of %d is: %d",a,(a+48));
	
	return 0;
}