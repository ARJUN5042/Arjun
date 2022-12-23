#include<stdio.h>
void main()
{
	int a,b,n;
	printf("\nEnter Value of A : ");
	scanf("%d",&a);
	printf("\nEnter Value of B : ");
	scanf("%d",&b);
	printf("\nA = %d\tB = %d",a,b);
	printf("\n\n-----------------------------------------------------\n");
	printf("\t# Choice Menu #\n");
	printf("-----------------------------------------------------\n\n");
	printf("Press 1 for Addition\n");
	printf("Press 2 for Subtraction\n");
	printf("Press 3 for Multiplication\n");
	printf("Press 4 for Division\n");
	printf("\nEnter your Choice ==> ? ");
	scanf("%d",&n);
	printf("\n");
	switch(n)
	{
		case 1:
			printf("\nAddition : %d + %d = %d",a,b,(a+b));
			break;
		case 2:
			printf("\nSubtraction : %d - %d = %d",a,b,(a-b));
			break;
		case 3:
			printf("\nMultiplication : %d * %d = %d",a,b,(a*b));
			break;
		case 4:
			printf("\nDivision : %d / %d = %.2f",a,b,((float)a/b));
			break;
		default:
			printf("\nInvalid Input!!!!!!!!!");
			break;
	}
}