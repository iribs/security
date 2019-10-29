#include <stdio.h>
#include <math.h>

int main(){
	char n="gao";
	int i=0;
	int asc=0;
	int sum=0;
	
	for(i=0;i<strlen(n);i++){
		if(n[i]>='a'&&n[i]<='z') asc[i]=n[i]-32;
		if(n[i]>='A'&&n[i]<='Z') asc[i]=n[i];
		sum=sum+asc[i];
	}
	
	int key=sum^0x5678^0x1234;
	printf("%d", key);
}
