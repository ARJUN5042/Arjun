#include<stdio.h>
void main()
{
	printf("\n\t\t\xB2\xB2\xB2\xB2\xB2\xB2 Simple Calculator \xB2\xB2\xB2\xB2\xB2\xB2");
	int a,b;
	printf("\n\n\t\tEnter A : ");
	scanf("%d",&a),
	printf("\n\t\tEnter B : ");
	scanf("%d",&b);
	
	printf("\n\n\t\tA = %d\tB = %d",a,b);
	printf("\n\n\t\tAddition : %d",(a+b));
	printf("\n\t\tSubtraction : %d",(a-b));
	printf("\n\t\tMultiplication : %d",(a*b));
	printf("\n\t\tDivision : %.2f",((float)a/b));
	printf("\n\t\tModulus : %d",(a%b));
}