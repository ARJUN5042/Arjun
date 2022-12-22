#include<stdio.h>
void add()
{
	int a=10,b=20;
	printf("\nAddition : %d",(a+b));
}
void subtract()
{
	int a=20,b=10;
	printf("\nSubtraction : %d",(a-b));
}
void mult()
{
	int a=10,b=20;
	printf("\nMultiplication : %d",(a*b));
}
void div()
{
	int a=50,b=2;
	printf("\nDivision : %.2f",((float)a/b));
}
void main()
{
	int n;
	
	printf("\n------------------------------------------\n");
	printf("\t\tChoice Menu");
	printf("\n------------------------------------------\n");
	printf("\n\nPress 1 for addtion");
	printf("\nPress 2 for Subtraction");
	printf("\nPress 3 for Multiplication");
	printf("\nPress 4 for Division");
	printf("\n\nEnter Your Choice : ");
	scanf("%d",&n);
	switch(n)
	{
		case 1:
			printf("\n");
			add();
			break;
		case 2:
			printf("\n");
			subtract();
			break;	
		case 3:
			printf("\n");
			mult();
			break;
		case 4:
			printf("\n");
			div();
			break;
		default:
			printf("\nInvalid Input!!!!");
			break;
	}

}