#include<stdio.h>
int main()
{
	char ch[100]="**********";
    char c='A';
    int i=0,j;

    printf("Write Your Name: ");

    while(c)
    {
        c=getch();
  		printf("%c\a",ch[i]);
  		i++;
  		if(i==10)
  		{
			printf("");
			i=0;
		}

	}		
	return 0;
}