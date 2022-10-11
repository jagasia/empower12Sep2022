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
    int count=0;
    Customer carr[10];
    
    int choice=0;
    do
    {
        printf("1: Add Customer\n2: Display All Customers\n3: Exit\n");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1: //Add
            printf("Id:");
            scanf("%d",&carr[count].id);
            printf("Name:");
            scanf("%s",carr[count].name);
            count++;
            break;
        case 2: //Display All Customers
            printf("Displaying the existing customers\n");
            for(int i=0;i<count;i++)
            {
                printf("%d\t%s\n",carr[i].id,carr[i].name);
            }
            printf("-----------------------\n");
            break;
        default:
            break;
        }
    } while (choice<=2);
    

}