#include<stdio.h>
int main()
{
	int arr[100]={0};
	int i,x,pos,n=10;
	
	for(i=0;i<10;i++)
	{
		arr[i]=i+1;
	}
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");

	pos=2;
	n--;	
	
    for (i=pos-1;i<n;i++)
    {
    	arr[i]=arr[i+1];
	}
		
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}	
	return 0;
}