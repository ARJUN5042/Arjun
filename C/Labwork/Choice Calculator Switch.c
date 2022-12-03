#include<stdio.h>
void main()
{
	printf("\n\t\t\xB2\xB2\xB2\xB2\xB2\xB2 Choise Calculator \xB2\xB2\xB2\xB2\xB2\xB2");
	int a,b,choice;
	printf("\n\n\t\tEnter A : ");
	scanf("%d",&a);
	printf("\n\t\tEnter B : ");
	scanf("%d",&b);
	printf("\n\n\t\tA = %d\tB = %d",a,b);
	
	printf("\n\n\t\t\xB2\xB2\xB2\xB2\xB2\xB2\xB2\xB2\xB2\xB2 Menu \xB2\xB2\xB2\xB2\xB2\xB2\xB2\xB2\xB2\xB2");
	
	printf("\n\n\t\tPress 1. Addition");
	printf("\n\t\tPress 2. Subtraction");
	printf("\n\t\tPress 3. Multiplication");
	printf("\n\t\tPress 4. Division");
	
	printf("\n\n\t\tEnter your choice? ");
	scanf("%d",&choice); 
	
	switch (choice)
	{
		case 1:
			printf("\n\t\tAddition : %d",(a+b));
			break;
		case 2:
			printf("\n\t\tSubtraction : %d",(a-b));
			break;
		case 3:
			printf("\n\t\tMultiplication : %d",(a*b));
			break;
		case 4:
			printf("\n\t\tDivision : %.2f",((float)a/b));
			break;
		default :
			printf("\n\t\tInvalid Input!");
			break;
	}
}