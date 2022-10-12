#include<stdio.h>

void main()
{
    FILE *fptr=fopen("sourabh.txt","w");
    fprintf(fptr,"Hi Sourabh, how are you!");
    printf("Hello world");
}