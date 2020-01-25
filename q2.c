#include <stdio.h>

int main(){
	char num={12, 15, 221, 3, 432, 54, 16, 67};
	int flag=0, i=0;
	
	for(i=0;i<8;i++)
	{
		if( num[i] <= num[i+1] ) flag=num[i+1];
		else flag=num[i];
		i++;
	}
	
	printf("%d", flag);
}
