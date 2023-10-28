#include<stdio.h>
int main()
{  
    int n,firstDigit,lastDigit;
    printf("Enter the Number: ");
    scanf("%d", &n);
    lastDigit=n%10;
    while(n>0)
    {
    	firstDigit=n%10;
    	n/=10;
	}
	printf("\nFirst Digit: %d",firstDigit);
	printf("\nLast Digit: %d",lastDigit);
	int add=firstDigit+lastDigit;
	printf("\nSum of first and last digit is: %d",add);
    return 0;
}
