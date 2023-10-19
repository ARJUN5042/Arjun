#include<stdio.h>
#include<math.h>
int main()
{
	double n;
	
	printf("Enter an Integer: ");
	scanf("%lf",&n);

	for(int i=1;i<=3;i++)
	{
		double result=pow(n,i);
		printf("%.2lf^%d = %.2lf\n",n,i,result);
	}
	
	return 0;
}