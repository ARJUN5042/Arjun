#include<stdio.h>
int main()
{
	char name[100];
	int n=10;
	for(int i=0;i<n;i++)
	{
		scanf("%s",&name[i]);
	}
	for(int i=0;i<n;i++)
	{
		printf("%c",name[i]);
	}
	return 0;
}