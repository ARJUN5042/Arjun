#include<stdio.h>
int max(int arr[],int k)
{
	int i,m;
	m=arr[0];
	for(i=1;i<k;i++)
	{
		if(arr[i]>m)
		{
			m=arr[i];
		}
	}
		return (m);
}
void main()
{
	int a[5],m,n=5,i;
	
	for(i=0;i<5;i++)
	{
		printf("\nEnter element %d : ",i+1);
		scanf("%d",&a[i]);
	}
	printf("\n\nYour Array is : \n");
	for(i=0;i<5;i++)
	{
		printf("%d\t",a[i]);
	}
	m=max(a,n);
	printf("\n\nMax Element is : %d",m);
}