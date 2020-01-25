#include <stdio.h>

int proc(int *a1, int a2, int a3){
	int v4;
	int v5=0;
	int v6;
	int i;
	
	for(i=0;i<a2;i++)
	{
		v6=1;
		
		while(v6<a3)
		{
			v6++;
			v5=(v5+1)%a2;
		}
		
		while(!a1[v5])  v5=(v5+1)%a2;
		
		v4=a1[v5];
		a1[v5]=0;
	}
	
	return v4;
}

int main()
{
	int a=7;
	int b=100;
	int c=0;
	int n=0;
	
	int i=0;
	for(i=0;i<100;i++) n[i]=i+1;
	int x=proc(n, b, a);
	printf("%d", x);
	
}
