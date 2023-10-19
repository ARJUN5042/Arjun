#include <stdio.h>
#include <math.h>

int main() {
    double principal, rate, time, amount, compoundInterest;
    
    printf("Enter the principal amount: ");
    scanf("%lf", &principal);

    printf("Enter the annual interest rate: ");
    scanf("%lf", &rate);

    printf("Enter the number of years: ");
    scanf("%lf", &time);

	amount = principal * pow((1 + (rate/100)), time);
	
	compoundInterest= amount - principal;
	
	printf("Amount after Including Interest: %.2lf",amount);
	printf("\nCompount Interest: %.2lf",compoundInterest);
    return 0;
}
