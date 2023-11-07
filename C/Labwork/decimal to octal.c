#include<stdio.h>
void decimaltoOctal(int deciNum) 
{ 
  
    int octalNum = 0, countval = 1; 
    int dNo = deciNum; 
  
    while (deciNum != 0) 
	{
        int remainder = deciNum % 8;  
        octalNum += remainder * countval; 
        countval = countval * 10; 
        deciNum /= 8; 
    } 
    printf("%d", octalNum); 
} 

int main() 
{ 
    int n;
	
	printf("Enter number: ");
	scanf("%d",&n); 
  
    decimaltoOctal(n); 
    return 0; 
}