#include<stdio.h>
int main()
{
	int days;
	printf("Enter days: ");
	scanf("%d",&days);
	
	int months=days/30;
	int remain=days%30;
	
	printf("%d days in months is: %dmonth and %d days",days,months,remain);
	
	return 0;
}