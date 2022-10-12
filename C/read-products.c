#include<stdio.h>

typedef struct Product
{
    int id;
    char name[20];
    float price;
} Product;

void main()
{
    FILE *fptr=fopen("products.dat","r");
    Product product;
    while(fread(&product, sizeof(struct Product), 1, fptr))
        printf ("id = %d name = %s price = %f\n", product.id,
        product.name, product.price);
 
    // close file
    fclose (fptr);
}