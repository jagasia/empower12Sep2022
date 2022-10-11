#include <stdio.h>
#include <string.h>
int main ()
{
FILE *filePointer;
char dataToWrite [50] = "Educba - portal for learning";
filePointer = fopen ("Run Length IV.docx", "w");
if (filePointer == NULL)
{
printf ("file_handling_test.c file fails to get open.");
}
else
{
printf ("The file gets opened.\n");
if (strlen (dataToWrite) > 0)
{
fputs (dataToWrite, filePointer);
fputs ("\n", filePointer);
}
fclose(filePointer);
printf ("Data gets successfully written in file file_handling_test.c\n");
printf ("File now gets closed.");
}
return 0;
}