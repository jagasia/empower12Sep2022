#include<stdio.h>
#include<string.h>

typedef struct Customer Customer;
struct Customer
{
    int id;
    char name[20];

};

void main()
{
    Customer carr[10]={
        {1,"Siva"},
        {2,"Ram"},
        {3,"Ashok"}
    };
    // carr[0].id=100;
    // strcpy(carr[0].name,"Raja");
    for(int i=0;i<10;i++)
        printf("%d\t%s\n",carr[i].id,carr[i].name);
    printf("Hello world");
}