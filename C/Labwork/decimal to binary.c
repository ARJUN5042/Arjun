#include<stdio.h>
int main()
{
	int a[10],n,i;    

	printf("Enter the number to convert: ");    
	scanf("%d",&n);    
	for(i=0;n>0;i++)    
	{    
		a[i]=n%2;
		printf("a[%d] %d\t",i,a[i]);    
		n=n/2;
		printf("n %d\n",n);
	}    
	printf("\nBinary of Given Number is: ");    
	for(i=i-1;i>=0;i--)    
	{    
		printf("%d",a[i]);    
	}
	return 0;
}