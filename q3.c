#include <stdio.h>

int main(){
	int n=100;
	
	for(n=100;n<=999;n++)
	{
		int i=n/100;
		int j=(n-100*i)/10;
		int k=(n-100*i-10*j);
		
		int sum=i*i*i+j*j*j+k*k*k;
		if(n==sum)
		printf("%d", n);
		n++;
	}
}
