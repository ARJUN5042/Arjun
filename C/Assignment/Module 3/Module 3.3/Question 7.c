#include<stdio.h>

void main()
{
	char str[100];
	int i,l=0;
	printf("Enter the String : ");
	gets(str);
	printf("\n\nYour String is : %s",str);
	
	for(i=0;str[i]!='\0';i++)
	{
		l++;
	}
	printf("\n\nLength of String is : %d",l);
}