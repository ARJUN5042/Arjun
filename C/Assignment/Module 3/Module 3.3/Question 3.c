#include<stdio.h>
void revstring()
{
	char c;
	scanf("%c",&c);
	if(c!='\n')
	{
		revstring(c);
	}
	printf("%c",c);
}
void main()
{
	printf("Enter your string : ");
	revstring();
}