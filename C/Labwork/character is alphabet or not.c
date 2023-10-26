#include<stdio.h>

int main()
{
	char ch;
	
	printf("Enter character: ");
	scanf("%c",&ch);
	if((ch >= 'a') && (ch <= 'z'))
	{
		printf("%c is character.",ch);
	}
	else if ((ch >= 'A') && (ch <= 'Z'))
	{
		printf("%c is character",ch);
	}
	else
	{
		printf("%c it is digit",ch);
	}
	return 0;
}