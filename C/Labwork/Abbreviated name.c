#include<stdio.h>
int main()
{
	char a[20],b[20],c[20];
	
	printf("Enter school name: ");
	scanf("%s %s %s",&a,&b,&c);
	
	printf("%c. %c. %s",a[0],b[0],c);
	
	return 0;
}