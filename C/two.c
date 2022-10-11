#include<stdio.h>
#include<string.h>
struct Address
{
	int dno;
	char street[20];
	char city[20];
};

int main()
{
    
    struct Address address1;

    address1.dno=123;
       
    strcpy(address1.street,"Raja street");
    strcpy(address1.city,"Coimbatore");
    
    printf("%d",address1.dno);
    
    printf("%s",address1.street);
    printf("%s",address1.city);
    printf("Helllo");
}