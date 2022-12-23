#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	int i,l,o=0;
	printf("\nEnter a String : ");
	gets(str);
	printf("\n\nActual String is : %s",str);
	l=strlen(str);
	
	for(i=0;i<l;i++)
	{
		if(str[i]!=str[l-i-1])
		{
			o=1;
			break;
		}
	}
	printf("\n\nReverse String is : %s",strrev(str));
	if(o)
	{
		printf("\n\n%s is not a Palindrome String.",str);
	}
	else
	{
		printf("\n\n%s is a Palindrome String.",str);
	}
}