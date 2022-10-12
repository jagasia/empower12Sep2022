#include <stdio.h>
#include <string.h>

typedef struct Product
{
    int id;
    char name[20];
    float price;
} Product;

int main()
{
    // Product product={1,"Pencil",5.5};
    FILE *fptr=fopen("products.dat","w");
    Product products[10];
    int count = 0;
    int choice = 0;
    do
    {
        printf("1: Add Product\n2:Display All products\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1: // Add
            printf("Enter the id:");
            scanf("%d", &products[count].id);
            printf("Enter the name:");
            scanf("%s", products[count].name);
            printf("Price:");
            scanf("%f", &products[count].price);
            count++;
            break;
        case 2: // Display all
            printf("Displaying all the products\n");
            printf("--------------------------------\n");
            for (int i = 0; i < count; i++)
                printf("%d\t%s\t%f\n", products[i].id, products[i].name, products[i].price);
            printf("--------------------------------\n");
            break;
        }
    } while (choice < 3);

    fwrite(&products,10*(sizeof(struct Product)),1,fptr);

    return 0;
}