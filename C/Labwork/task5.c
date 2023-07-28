#include<stdio.h>
main()
{
	int n,i,next;
	int t0=0;
	int t1=1;
	printf("Enter Number: ");
	scanf("%d",&n);
	printf("\nFibonacci Series:\n");
	
	printf("%d %d ",t0,t1);
	for(i=2;i<n;i++)
	{
		next=t0+t1;
		printf("%d ",next);
		t0=t1;
		t1=next;
	}
	printf("\n");
}