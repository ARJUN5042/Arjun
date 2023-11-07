#include<stdio.h>
#include<string.h>
int main()
{
	char str1[]="Hello",str2[]="Hello",result;
	
	result = strcmp(str1, str2);
  	printf("strcmp(str1, str2) = %d\n", result);
	
	return 0;
}