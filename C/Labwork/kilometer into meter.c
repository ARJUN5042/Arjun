#include<stdio.h>
int main()
{
	float km,m;
	
	printf("Enter kilometer: ");
	scanf("%f",&km);
	
	m=km*1000;
	
	printf("%.2f kilometer has %.1f meters.",km,m);
	
	return 0;
}