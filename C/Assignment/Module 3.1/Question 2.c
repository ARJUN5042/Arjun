#include <stdio.h>
void main()
{
	int a=10, b=8;
	printf("\n\xB2\xB2\xB2\xB2\xB2\xB2 Calculator \xB2\xB2\xB2\xB2\xB2\xB2\n\n");
	printf("A = 10 \nB = 8\n\n");
	printf("Addition : A+B = %d\n",(a+b));
	printf("Subtraction : A-B = %d\n",(a-b));
	printf("Multiplication : A*B = %d\n",(a*b));
	printf("Division : A/B = %.2f\n",((float)a/b));
	printf("Modulus : A%%B = %d\n",(a%b));
}