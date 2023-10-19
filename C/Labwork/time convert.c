#include<stdio.h>
void main()
{
	int hours,minutes,seconds;
	printf("Enter minutes: ");
	scanf("%d",&minutes);
	
	hours=minutes/60;
	int remainminutes=minutes%60;
	seconds=minutes*60;
	
	printf("%d minutes has %d hours and %d minutes.\n",minutes,hours,remainminutes);
	printf("%d minutes has %d seconds",minutes,seconds);
}