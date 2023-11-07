#include<stdio.h>
int main()
{
	char str[100],t;
	printf("Enter String: ");
	scanf("%s",&str);
	int l=strlen(str)-1;
		
	for(int i=0;i<strlen(str)/2;i++)
	{
		t=str[i];
		str[i]=str[l];
		str[l--]=t;
	}	
	
    printf("Reverse string :%s",str);
	return 0;
}