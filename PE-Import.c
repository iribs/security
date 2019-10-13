#include <stdio.h>

int main(){
	FILE *fp = NULL;
	
	fp = fopen("C:/Users/sandgaw/Downloads/hw2/PE-1.txt", "a+");
	
	char check[255];
	char comp[32]="I want to learn PE file format!";
	fgets(check, 255, (FILE*)fp);
	
	int i,j=0;
	int n=0;
	for(i=0;i<=210;i++)
	{
		for(j=0;j<=30;j++)
		{
			if (check[i+j] == comp[j])
			{
				n=1;
			}
		}
	}
	
	if(n==1)
	printf("I want to learn PE file format!");
	else if(n==0)
	fputs("I want to learn PE file format!", fp);
	
	fclose(fp);
	getchar();
}
